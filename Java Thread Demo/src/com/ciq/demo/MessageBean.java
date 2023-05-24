package com.ciq.demo;

public class MessageBean {

	private String message;
	private boolean empty = true;

	public synchronized String read() {
		while (empty) {
			try {
				wait(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		empty = true;
		notify();
		return message;
	}

	public synchronized void write(String message) {
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		empty = false;
		this.message = message;
		notifyAll();
	}
}
