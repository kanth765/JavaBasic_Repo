package com.ciq.map;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentDobFormatter {

	private static final SimpleDateFormat SIMPLE_DATE_FORMATTER = new SimpleDateFormat("dd-mm-yyyy");

	public static String getDateMMDDYYY(Date date) {
		return SIMPLE_DATE_FORMATTER.format(date);
	}

	public static Date getDateMMDDYYY(String date) {
		try {
			return SIMPLE_DATE_FORMATTER.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
