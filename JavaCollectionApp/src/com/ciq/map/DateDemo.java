package com.ciq.map;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.swing.text.DateFormatter;

public class DateDemo {
	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);

		// 00--jan
		// 01--Feb

		Date d2 = new Date(1990, 01, 01);
		System.out.println(d2);

		// mm/dd/yyyy
		String dateFormating = "mm/dd/yyyy";
//		DateFormatter formatter=new DateFormatter(dateFormating);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormating);
		String formattedDate = simpleDateFormat.format(d2);
		System.out.println(formattedDate);
		System.out.println(LocalDate.now());

	}

}
