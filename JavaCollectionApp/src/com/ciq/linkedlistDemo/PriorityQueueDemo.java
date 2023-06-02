package com.ciq.linkedlistDemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {

		PriorityQueue<Integer> numbers = new PriorityQueue<Integer>();
//		numbers.add(14);
//		numbers.add(13);
//		numbers.add(11);
//		numbers.add(10);
//		numbers.add(12);
		numbers.offer(140);
		numbers.offer(130);
		numbers.offer(120);
		numbers.offer(110);
		numbers.offer(100);
		System.out.println(numbers);
	}

}
