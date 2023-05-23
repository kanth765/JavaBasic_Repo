package com.ciq.demo;

public class ReaderBean implements Runnable {

	private MessageBean messageBean;

	public ReaderBean(MessageBean messageBean) {
		super();
		this.messageBean = messageBean;
	}

	@Override
	public void run() {
		for (String latestMessage = messageBean.read(); !latestMessage
				.equals("Finished!"); latestMessage = messageBean.read()) {
			System.out.println(latestMessage);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
