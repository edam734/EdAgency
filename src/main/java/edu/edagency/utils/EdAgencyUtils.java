package edu.edagency.utils;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class EdAgencyUtils {

	private final static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
	 
	public static Date parseDate(String date) {
	    try {
	        return new Date(DATE_FORMAT.parse(date).getTime());
	    } catch (Exception e) {
	        throw new IllegalArgumentException(e);
	    }
	}
}
