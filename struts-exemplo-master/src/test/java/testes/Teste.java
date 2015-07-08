package testes;

import com.struts_exemplo.util.Util;

public class Teste{

	public static void main( String[ ] args ) {

		
		String data = "22/02/2012";
		
		System.out.println(Util.parseDate( data ));
		
		/*Fabricante fabricante = new Fabricante();

		fabricante.setDataFundacao( new Date() );
		fabricante.setNome( "honda" );
		fabricante.setSlogan( "aqui e mais" );
		fabricante.setPaisSede( "brasil" );

		FabricanteDAO dao = new FabricanteDAO();
		dao.salvar( fabricante );

		ArrayList< Fabricante > fabricantes = (ArrayList< Fabricante >) dao.buscar();

		for ( Fabricante fabricante2 : fabricantes ) {
			System.out.println( fabricante2.toString() );
		}*/

	}
}
