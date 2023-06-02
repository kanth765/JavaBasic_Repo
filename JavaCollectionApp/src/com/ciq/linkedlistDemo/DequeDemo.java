package com.ciq.linkedlistDemo;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {

	public static void main(String[] args) {
		Deque<Integer> tokens = new LinkedList<Integer>();
		tokens.add(35);
		tokens.add(36);
		tokens.addLast(30);
		tokens.offerLast(31);
		tokens.addFirst(32);
		tokens.offerFirst(33);
		tokens.offer(34);
		System.out.println(tokens);

		System.out.println(tokens.getFirst());
		System.out.println(tokens.peekFirst());
		System.out.println(tokens.getLast());
		System.out.println(tokens.peekLast());
		System.out.println(tokens.pollFirst());
		System.out.println(tokens.getFirst());

//		System.out.println("The first customer in the queue has the number: " + tokens.getFirst());
//
//		System.out.println("Customer with number " + tokens.removeFirst() + " is called.");
//		System.out.println(tokens);
//
//		System.out.println("Customer with number " + tokens.pollLast() + " is called.");
//		System.out.println(tokens);
//
//		tokens.remove(33);
//		System.out.println("Customer with number 33 is removed from the queue.");
//		System.out.println(tokens);

	}

}
