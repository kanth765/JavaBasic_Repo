package com.ciq.linkedlistDemo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(50);
		numbers.add(30);
		numbers.add(50);
//		numbers.add(null);
//		numbers.add(null);
		numbers.add(40);
		System.out.println(numbers);

		Collections.sort(numbers);
		System.out.println(numbers);

		LinkedList<String> countriesList = new LinkedList<String>();
		countriesList.add("India");
		countriesList.add("Russia");
		countriesList.add("England");
		countriesList.add("Australia");
		countriesList.add("Germany");
		countriesList.add("China");
		
		System.out.println(countriesList);
		
		countriesList.remove("Russia");
		
		System.out.println(countriesList);
		
		countriesList.add("Japan");
		
		System.out.println(countriesList);
		
		// iterations, searching, sorting, 

	}

}
