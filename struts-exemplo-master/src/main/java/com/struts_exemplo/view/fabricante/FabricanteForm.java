package com.struts_exemplo.view.fabricante;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import com.struts_exemplo.model.pojo.Fabricante;

/**
 * Classe respons�vel por conter um atributo para cada campo na tela(JSP).
 * Todas as altera��es que quiser fazer nos campos da tela, dever�o ser feitas no FORM.
 * Isso porque a tela � carregada com base numa classe FORM, sendo assim, tudo que
 * fizer na classe FORM ser� refletido nos campos da tela.
 * 
 * @author Eric Luiz Ferras <ciencias_exatas@hotmail.com.br>
 * @since 11/05/2014 15:31:48
 * @version 1.0
 */
public final class FabricanteForm extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7428722218248039562L;

	private String id;

	private String nome;

	private String sobrenome;
	
	private String dataFundacao;

	private String slogan;

	private String paisSede;

	private ArrayList< Fabricante > fabricantes;

	/**
	 * M�todo respons�vel por retornar o valor do atributo fabricantes.
	 * 
	 * @return ArrayList<Fabricante> fabricantes - fabricantes a ser retornado(a).
	 */
	public ArrayList< Fabricante > getFabricantes() {
		if ( fabricantes == null ) {
			fabricantes = new ArrayList< Fabricante >();
			System.out.println("fabricantes null");
		}
		return fabricantes;
	}

	/**
	 * M�todo respons�vel por atribuir o valor ao atributo fabricantes.
	 * 
	 * @param ArrayList<Fabricante> fabricantes - fabricantes a ser atribuido(a).
	 */
	public void setFabricantes( ArrayList< Fabricante > fabricantes ) {
		this.fabricantes = fabricantes;
	}

	/**
	 * M�todo respons�vel por retornar o valor do atributo id.
	 * 
	 * @return String id - id a ser retornado(a).
	 */
	public String getId() {
		return id;
	}

	/**
	 * M�todo respons�vel por atribuir o valor ao atributo id.
	 * 
	 * @param String id - id a ser atribuido(a).
	 */
	public void setId( String id ) {
		this.id = id;
	}

	/**
	 * M�todo respons�vel por retornar o valor do atributo nome.
	 * 
	 * @return String nome - nome a ser retornado(a).
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * M�todo respons�vel por atribuir o valor ao atributo nome.
	 * 
	 * @param String nome - nome a ser atribuido(a).
	 */
	public void setNome( String nome ) {
		this.nome = nome;
	}
	
	/**
	 * M�todo respons�vel por atribuir o valor ao atributo sobrenome.
	 * 
	 * @param String sobrenome - sobrenome a ser atribuido(a).
	 */
	public void setSobrenome( String sobrenome ) {
		this.sobrenome = sobrenome;
	}

	/**
	 * M�todo respons�vel por retornar o valor do atributo sobrenome.
	 * 
	 * @return String sobrenome - sobrenome a ser retornado(a).
	 */
	public String getSobrenome() {
		return sobrenome;
	}
	
	/**
	 * M�todo respons�vel por retornar o valor do atributo dataFundacao.
	 * 
	 * @return String dataFundacao - dataFundacao a ser retornado(a).
	 */
	public String getDataFundacao() {
		return dataFundacao;
	}

	/**
	 * M�todo respons�vel por atribuir o valor ao atributo dataFundacao.
	 * 
	 * @param String dataFundacao - dataFundacao a ser atribuido(a).
	 */
	public void setDataFundacao( String dataFundacao ) {
		this.dataFundacao = dataFundacao;
	}

	/**
	 * M�todo respons�vel por retornar o valor do atributo slogan.
	 * 
	 * @return String slogan - slogan a ser retornado(a).
	 */
	public String getSlogan() {
		return slogan;
	}

	/**
	 * M�todo respons�vel por atribuir o valor ao atributo slogan.
	 * 
	 * @param String slogan - slogan a ser atribuido(a).
	 */
	public void setSlogan( String slogan ) {
		this.slogan = slogan;
	}

	/**
	 * M�todo respons�vel por retornar o valor do atributo paisSede.
	 * 
	 * @return String paisSede - paisSede a ser retornado(a).
	 */
	public String getPaisSede() {
		return paisSede;
	}

	/**
	 * M�todo respons�vel por atribuir o valor ao atributo paisSede.
	 * 
	 * @param String paisSede - paisSede a ser atribuido(a).
	 */
	public void setPaisSede( String paisSede ) {
		this.paisSede = paisSede;
	}

}
