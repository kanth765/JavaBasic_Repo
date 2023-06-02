package com.ciq.linkedlistDemo;

import java.util.LinkedList;
import java.util.Queue;

public class LinkeListWithQueuDemo {

	public static void main(String[] args) {

		Queue<Integer> tokens = new LinkedList<Integer>();
//		tokens.add(null);
//		tokens.offer(000);
		tokens.offer(102);
//		tokens.offer(103);
//		System.out.println(tokens);
//		System.out.println("get the first token in the pool: " + tokens.poll());
//		System.out.println("get the first token in the pool: " + tokens.remove());
		
//		System.out.println("first element token task is completed remove the queue");
//		System.out.println(tokens);
		System.out.println(tokens.peek());
		System.out.println(tokens.element());
//		System.out.println(tokens);
//		System.out.println("get the next token in the pool: " + tokens.peek());
//		System.out.println(tokens);

	}

}
