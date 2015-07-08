package com.struts_exemplo.view.fabricante;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.mysql.jdbc.FailoverConnectionProxy;
import com.struts_exemplo.model.dao.FabricanteDAO;
import com.struts_exemplo.model.pojo.Fabricante;
import com.struts_exemplo.util.Util;

/**
 * Classe responsável pela comunicação da camada WEB com a camada JAVA.
 * Todas as requisições feitas a Servlet Struts passarão por classes como esta.
 * Nesta classe conterá todos os métodos que serão, de alguma forma, chamados pela JSP,
 * como por exemplo: inserir, alterar, excluir, consultar, etc...
 * Está classe é a ligação direta com a camada WEB, sendo a ultima classe da camada JAVA.
 * Quando a JSP de categoria for submetida, o Struts procurará loucamente por um método na
 * classe action informada na propriedade "action" do formulario que contenha o nome
 * igual ao nome informado na propriedade "acao" do formulario na JSP.
 * Ex:
 * <form action="equipamentoAction">
 * <html:hidden property="acao" value="inserir"/>
 * .........
 * </form>
 * 
 * @author Eric Luiz Ferras <ciencias_exatas@hotmail.com.br>
 * @since 11/05/2014 15:14:33
 * @version 1.0
 */
public final class FabricanteAction extends DispatchAction{

	/**
	 * Método responsável por abrir a tela de Contato.
	 * Para que este método possa ser chamado na JSP, é necessário que este tenha
	 * a estrutura abaixo:
	 * public ActionForward nome_do_metodo( ActionMapping mapping,
	 * ActionForm form,
	 * HttpServletRequest request,
	 * HttpServletResponse response){
	 * return mapping.findForward("nome da tela mapeada no struts-config");
	 * }
	 * 
	 * @param ActionMapping mapping - Responsável por localizar e abrir a tela cujo nome
	 *        foi informado como parametro ao método "findForward".
	 * @param ActionForm form - Responsável por conter todos os atributos referentes a
	 *        tela preenchidos. Isso apenas se o formulario for submetido.
	 * @param HttpServletRequest request - Responsável por possibiliar a captura de dados
	 *        do meio WEB.
	 * @param HttpServletResponse response - Responsável por possibiliar o envio de dados
	 *        ao meio WEB.
	 * @return ActionForward - Tela a ser aberta.
	 * 
	 * @author Eric Luiz Ferras <ciencias_exatas@hotmail.com.br>
	 * @since 11/05/2014 15:29:30
	 * @version 1.0
	 */
	public ActionForward abrir( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {
		return carregar( mapping, form, request, response );
		//return mapping.findForward( "abrir_fabricante" );
	}

	public ActionForward carregar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {
		System.out.println( "carregando" );

		FabricanteDAO dao = new FabricanteDAO();

		FabricanteForm form2 = (FabricanteForm) form;
		form2.setFabricantes( (ArrayList< Fabricante >) dao.buscar() );
		int i = 0;
		while(i < form2.getFabricantes().size()){
			if(form2.getFabricantes().get(i).getSobrenome() == null){
				form2.getFabricantes().get(i).setSobrenome("------------");
			}
			i++;
		}
		return mapping.findForward( "abrir_fabricante" );
	}

	public ActionForward salvar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		FabricanteForm fabricanteForm = (FabricanteForm) form;

		Fabricante fabricante = new Fabricante();
		fabricante.setDataFundacao( Util.parseDate( fabricanteForm.getDataFundacao() ) );
		fabricante.setNome( fabricanteForm.getNome() );
		fabricante.setSobrenome( fabricanteForm.getSobrenome() );
		fabricante.setPaisSede( fabricanteForm.getPaisSede() );
		fabricante.setSlogan( fabricanteForm.getSlogan() );

		FabricanteDAO dao = new FabricanteDAO();

		dao.salvar( fabricante );

		return carregar( mapping, form, request, response );
		//return mapping.findForward( "abrir_fabricante" );
	}
	
	public ActionForward excluir( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		FabricanteForm fabricanteForm = (FabricanteForm) form;

		FabricanteDAO dao = new FabricanteDAO();

		dao.excluir( new Integer(fabricanteForm.getId()) );

		return carregar( mapping, form, request, response );
		//return mapping.findForward( "help" );
	}
	
	public ActionForward popular( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		FabricanteForm fabricanteForm = (FabricanteForm) form;
		
		Fabricante fabricante = new FabricanteDAO().buscarById(new Integer (fabricanteForm.getId()));
		fabricanteForm.setNome(fabricante.getNome());
		fabricanteForm.setSobrenome(fabricante.getSobrenome());
		fabricanteForm.setDataFundacao(Util.parseDate(fabricante.getDataFundacao()));
		fabricanteForm.setSlogan(fabricante.getSlogan());
		fabricanteForm.setPaisSede(fabricante.getPaisSede());
		
		//return carregar( mapping, form, request, response );
		return mapping.findForward( "editar_fabricante" );
	}
	
	public ActionForward editar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		FabricanteForm fabricanteForm = (FabricanteForm) form;

		Fabricante fabricante = new Fabricante();
		fabricante.setId(new Integer(fabricanteForm.getId()));
		fabricante.setDataFundacao( Util.parseDate( fabricanteForm.getDataFundacao() ) );
		fabricante.setNome( fabricanteForm.getNome() );
		fabricante.setSobrenome( fabricanteForm.getSobrenome() );
		fabricante.setPaisSede( fabricanteForm.getPaisSede() );
		fabricante.setSlogan( fabricanteForm.getSlogan() );

		FabricanteDAO dao = new FabricanteDAO();

		dao.alterar( fabricante );

		return abrir( mapping, form, request, response );
		//return mapping.findForward( "abrir_fabricante" );
	}
	

}
