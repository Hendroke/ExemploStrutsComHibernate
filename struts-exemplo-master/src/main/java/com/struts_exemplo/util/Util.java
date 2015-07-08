package com.struts_exemplo.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util{

	public static Date parseDate( String data ) {
		if ( data == null || data.equals( "" ) )
			return null;

		Date date = null;
		try {
			DateFormat formatter = new SimpleDateFormat( "dd/MM/yyyy" );
			date = (java.util.Date) formatter.parse( data );
		} catch ( ParseException e ) {
			e.printStackTrace();
		}
		return date;
	}

	public static String parseDate( Date date ) {
		SimpleDateFormat format = new SimpleDateFormat( "dd/MM/yyyy" );
		return format.format( date );
	}

}
