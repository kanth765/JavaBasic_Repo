package com.ciq.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, Double> fruits = new LinkedHashMap<String, Double>();
		fruits.put("Mango", 50.00);
		fruits.put("Bananna", 40.00);
		fruits.put("Grapes", 120.00);
		fruits.put("Apple", 250.00);
		fruits.put("Orange", 80.00);

		for (Map.Entry<String, Double> entry : fruits.entrySet()) {
			System.out.println("KEY: " + entry.getKey() + " value: " + entry.getValue());
		}

		System.out.println("****************************************");
		
		HashMap<String, Double> groceries = new HashMap<String, Double>();
		groceries.put("Mango", 50.00);
		groceries.put("Bananna", 40.00);
		groceries.put("Grapes", 120.00);
		groceries.put("Apple", 250.00);
		groceries.put("Orange", 80.00);

//		for (Map.Entry<String, Double> entry : groceries.entrySet()) {
//			System.out.println("KEY: " + entry.getKey() + " value: " + entry.getValue());
//		}
		
		System.out.println("****************************************");
		
		HashMap<String, Double> products = new HashMap<String, Double>();
		products.put("Milk", 30.00);
		products.put("Sugger", 40.00);
		products.put("Oil", 180.00);
		
		HashMap<String, Double> listOfProducts=new HashMap<>(groceries);
		listOfProducts.putAll(products);
		

		for (Map.Entry<String, Double> entry : listOfProducts.entrySet()) {
			System.out.println("KEY: " + entry.getKey() + " value: " + entry.getValue());
		}
	}

}
