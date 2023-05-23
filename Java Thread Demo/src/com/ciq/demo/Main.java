package com.ciq.demo;


public class Main {
	public static void main(String[] args) {

		System.out.println(ThreadColor.ANSI_RED + " Hello from the main thread "+ Thread.currentThread().getName());
		Thread t1 = new AnotherThread();
		t1.start();

		new Thread() {
			public void run() {
				System.out.println(ThreadColor.ANSI_GREEN + "Hello from the anonymous class thread" + Thread.currentThread().getName());
			};
		}.start();

		Thread my = new Thread(new ThreadDemo() {
			@Override
			public void run() {
				System.out.println(ThreadColor.ANSI_CYAN + "Hello from the anonymous class's implementation of run()");
//			try {
//				t1.join(200);
//				System.out.println(
//						ThreadColor.ANSI_BLACK + "AnotherThread terminated, or timed out, so I'm running again");
//			} catch (InterruptedException e) {
//				System.out.println(ThreadColor.ANSI_CYAN + "I couldn't wait after all. I was interrupted");
//			}
			}
		});
		my.start();

	}

}
