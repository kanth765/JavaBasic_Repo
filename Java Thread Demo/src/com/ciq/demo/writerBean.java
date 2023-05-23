package com.ciq.demo;

import java.util.Random;

public class writerBean implements Runnable {

	private MessageBean messageBean;

	public writerBean(MessageBean messageBean) {
		super();
		this.messageBean = messageBean;
	}

	@Override
	public void run() {
		String messages[] = { "Humpty Dumpty sat on a wall", "Humpty Dumpty had a great fall",
				"All the king's horses and all the king's men", "Couldn't put Humpty together again" };

		Random random = new Random();

		for (int i = 0; i < messages.length; i++) {
			messageBean.write(messages[i]);
			try {
				Thread.sleep(random.nextInt(2000));
			} catch (InterruptedException e) {

			}
		}
		messageBean.write("Finished!");
	}

}
