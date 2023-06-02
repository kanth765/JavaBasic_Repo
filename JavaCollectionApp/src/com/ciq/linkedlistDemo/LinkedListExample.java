package com.ciq.linkedlistDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// daily activites

		LinkedList<String> dailyRoutinework = new LinkedList<String>();
		dailyRoutinework.add("take a walk with Dog!!!");
		dailyRoutinework.addFirst("wake up and bresh the teeth!!");
		dailyRoutinework.add("make a break fast ");
		dailyRoutinework.add("reading a book and preparing lunch");
		dailyRoutinework.add("going to office");
		dailyRoutinework.offerLast("finshed my work and return to home");
		dailyRoutinework.addLast("going to sleep!!!");

//		System.out.println(dailyRoutinework.peek());
//		System.out.println(dailyRoutinework.peekFirst());
//		System.out.println(dailyRoutinework.getFirst());
//		System.out.println(dailyRoutinework.peekLast());
//		System.out.println(dailyRoutinework.getLast());
//		System.out.println(dailyRoutinework.pollFirst());// returns and remove the 
//		System.out.println(dailyRoutinework.removeFirst());
		System.out.println(dailyRoutinework.pollLast());// returns and remove the 
		System.out.println(dailyRoutinework.removeLast());

		Iterator<String> iterator = dailyRoutinework.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
