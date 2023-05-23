package com.ciq.demo;

public class CountDownThread implements Runnable {

	private CountDown countDown;

	public CountDownThread(CountDown countDown) {
		this.countDown = countDown;
	}

	@Override
	public void run() {
		countDown.doCountDown();

	}

}
