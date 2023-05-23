package com.ciq.demo;

public class ThreadTest {

	public static void main(String[] args) {
		ThreadDemo demo = new ThreadDemo();
		Thread t1 = new Thread(demo);
		t1.start();
		t1.setName("thread demo");
		
		
		MyThread myThread = new MyThread();
		Thread t2 = new Thread(myThread);
		t2.start();
		t2.setName("My thread");
	}
}
