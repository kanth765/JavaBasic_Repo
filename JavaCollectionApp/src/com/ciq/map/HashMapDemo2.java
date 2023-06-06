package com.ciq.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		HashMap<String, String> countries = new HashMap<String, String>();
		countries.put("India", "New Delhi");
		countries.put("England", "London");
		countries.put("Russia", "Moscow");
		countries.put("China", "Beezing");
		countries.put("Australia", "Sydney");
//		countries.put("India", "Mumbai");
		// hash table
		System.out.println(countries);
		String input = "Mumbai";
		System.out.println("*****************************************");
		if (countries.containsKey("Pakistan")) {
//			countries.put("India", input);
			System.out.println(countries);
		} else {
			countries.put("Pakistan", input);
		}
		System.out.println(countries);
//		countries.remove("Pakistan", input);

		System.out.println("*****************************************");
		for (String country : countries.keySet()) {
			System.out.println(" Keys: " + country + " values: " + countries.get(country));

		}
		System.out.println("*****************************************");
		Set<String> keySet = countries.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String country = iterator.next();
			System.out.println(country);
		}
		System.out.println("*****************************************");

		Collection<String> values = countries.values();
		Iterator<String> iterator2 = values.iterator();
		while (iterator2.hasNext()) {
			String country = iterator2.next();
			System.out.println(country);
		}

		System.out.println("*****************************************");

		for (Map.Entry<String, String> country : countries.entrySet()) {
			System.out.println("key: " + country.getKey() + " values: " + country.getValue());
		}
	}

}
