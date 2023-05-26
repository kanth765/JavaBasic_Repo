package com.ciq.arraylistDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		//Homogeneous //generics --> type safety
		ArrayList<Integer> prices = new ArrayList<>(5);
		prices.add(250);// int or integer
		prices.add(100);
//		arrayList.add("Array List Class"); // remove
//		arrayList.add('M');
//		arrayList.add(true);
//		arrayList.add(144.3f); // float orFLoat
//		arrayList.add(2000.00);
		System.out.println(prices);
//		int oldCa=5;
//		int newc= (oldCa * 3)/2 + 1;
//		System.out.println(newc);
		
		// auto-boxing, how to provide type safety
		
		int sum = 0;
		for (Object object : prices) {
			Integer value = (Integer) object;
			sum = sum + value;
		}
		System.out.println(sum);
		
		ArrayList<String> products=new ArrayList<String>();
		products.add("Apple");
		products.add("Mango");
		
		ArrayList<Object> groceryList=new ArrayList<Object>(prices);
		groceryList.add(products);
		
		for (Object grocery : groceryList) {
			System.out.println(grocery);
		}
	}

}
