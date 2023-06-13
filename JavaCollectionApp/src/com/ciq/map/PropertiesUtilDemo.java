package com.ciq.map;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtilDemo {

	public static void main(String[] args) {

		Properties prop = new Properties();
		try {
			prop.load(PropertiesUtilDemo.class.getClassLoader().getResourceAsStream("com/ciq/prop/db.properties"));
			System.out.println(prop.getProperty("mysql.url"));
			System.out.println(prop.getProperty("mysql.driverName"));
			System.out.println(prop.getProperty("mysql.un"));
			System.out.println(prop.getProperty("mysql.pw"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
