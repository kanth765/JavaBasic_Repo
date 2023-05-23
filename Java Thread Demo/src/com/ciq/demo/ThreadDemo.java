package com.ciq.demo;

public class ThreadDemo extends Thread {
	// creating a thread class

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(2000);
				System.out.println(i + " " + Thread.currentThread().getName());// 5 units
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	// max--->10
	// min--->1
	// normal-->5

	public static void main(String[] args) throws InterruptedException {

		for (int i = 1; i <= 5; i++) {
		
			System.out.println(i + " " + Thread.currentThread().getName());// 5 units
		}
//new state
		ThreadDemo demo = new ThreadDemo();
//		demo.start();
//		demo.run();
		Thread t1 = new Thread(demo);
		t1.start();
		t1.setName("thread 1");
//		t1.setPriority(10);
//		System.out.println(t1.MAX_PRIORITY);

		Thread t2 = new Thread(demo);
		t2.start();
		t2.setName("thread 2");
//		t2.setPriority(5);
//		System.out.println(t2.MIN_PRIORITY);
		Thread t3 = new Thread(demo);
		t3.start();
		t3.setName("thread 3");
		t3.join();
//		t3.setPriority(1);
//		System.out.println(t3.NORM_PRIORITY);

	}

}
