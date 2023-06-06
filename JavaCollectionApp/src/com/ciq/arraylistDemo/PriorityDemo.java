package com.ciq.arraylistDemo;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityDemo {

	public static void main(String[] args) {
		Queue<Integer> numbers = new PriorityQueue<>();
		numbers.add(102);
		numbers.add(101);
		numbers.add(100);
		numbers.add(103);
		System.out.println(numbers);
	
		
		
//		
//		Comparator  comparator =  numbers.comparator();
//		System.out.println(comparator);
//		
////		Collections.sort(null);
//
//		ArrayDeque<Integer> numbs = new ArrayDeque<Integer>();
//		numbs.addAll(numbers);
//		Iterator<Integer> descendingIterator = numbs.descendingIterator();
//		while (descendingIterator.hasNext()) {
//			System.out.println(descendingIterator.next());
//		}

		// 100, 101, 102, 103
	}

}
