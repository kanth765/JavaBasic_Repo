package com.ciq.objectcdemo;

public class Oreder implements Cloneable {

	private int orderId;
	private String orderStatus;

	public Oreder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Oreder(int orderId, String orderStatus) {
		super();
		this.orderId = orderId;
		this.orderStatus = orderStatus;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "Oreder [orderId=" + orderId + ", orderStatus=" + orderStatus + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
