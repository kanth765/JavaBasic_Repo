package com.ciq.demo;

public class ProducerConsumerTest {

	public static void main(String[] args) {
		MessageBean message = new MessageBean();
		writerBean writer = new writerBean(message);
		Thread t1 = new Thread(writer);
		t1.start();

		ReaderBean reader = new ReaderBean(message);
		Thread t2 = new Thread(reader);
		t2.start();

	}

}
