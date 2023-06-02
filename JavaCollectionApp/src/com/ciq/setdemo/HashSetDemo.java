package com.ciq.setdemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(100);
		numbers.add(101);
		numbers.add(105);
		numbers.add(103);
		numbers.add(102);
		numbers.add(104);
		System.out.println(numbers);
		
		
		HashSet<String> names = new HashSet<>();
		// hash table
		System.out.println(names);
		names.add(null); //hash value 0
		names.add("anil"); //hash value 4
		names.add("balu");//hash value 2
		names.add("dharma");//hash value 1
		names.add("charvy");//hash value 5
		names.add("aravind"); //hash value 3
		names.add("anil");
		names.add(null);
		names.add(null);

		System.out.println(names);

	}

}
