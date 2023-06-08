package com.ciq.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {

		Hashtable<String, Double> groceries = new Hashtable<String, Double>();
		System.out.println(groceries.size());
		groceries.put("Mango", 50.00);
		groceries.put("Bananna", 40.00);
		groceries.put("Grapes", 120.00);
		groceries.put("Apple", 250.00);
		groceries.put("Orange", 80.00);
		groceries.put("Grapes", 120.00);
		for (Map.Entry<String, Double> entry : groceries.entrySet()) {
			System.out.println("KEY: " + entry.getKey() + " value: " + entry.getValue());
		}

	}

}
