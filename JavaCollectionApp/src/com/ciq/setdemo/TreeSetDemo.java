package com.ciq.setdemo;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> fruits = new TreeSet<String>();
//		fruits.add(null);
		fruits.add("Grapes");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("M");
		fruits.add("Apple");
		fruits.add("Promogranite");
		fruits.add("Blue berries");
//		fruits.add("Grapes");
		fruits.add("Manio");// 11
		fruits.add("Orange");
//		fruits.add("Banana");
// treeset sorting order by default asc
		System.out.println(fruits);
//		System.out.println(fruits.lower("Promogranite"));
//		System.out.println(fruits.lower("1232391239281"));// 12

//		System.out.println(fruits.higher("Mango"));
		
		
		SortedSet<String> subSet = fruits.subSet("Apple", "Blue berries");
		
		System.out.println(subSet);

//		NavigableSet<String> navigableSet = fruits.descendingSet();
//		Iterator<String> iterator = navigableSet.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}

	}

}
