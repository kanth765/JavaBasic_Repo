package com.ciq.linkedlistDemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<Integer> numbers=new Stack<Integer>();
		numbers.add(100);
		numbers.add(110);
		numbers.add(120);
		numbers.add(130);
		numbers.push(140);
		System.out.println(numbers);
		System.out.println();
//		System.out.println(numbers.peek());
		System.out.println(numbers.pop());
		System.out.println(numbers);
		
	}

}
