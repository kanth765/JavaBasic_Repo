package com.ciq.arraylistDemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueSemo {
	public static void main(String[] args) {
		Queue<Integer> bankQueueNumbers = new PriorityQueue<>();
		bankQueueNumbers.add(34);
		bankQueueNumbers.offer(32);
		bankQueueNumbers.offer(31);
		bankQueueNumbers.offer(33);
		bankQueueNumbers.offer(30);

		System.out.println(bankQueueNumbers);
	}

}
