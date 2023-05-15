package com.ciq.demo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Customer extends Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String productName;
	private double price;

	public Customer() {
	}

	public Customer(int id, String fn, String ln, int age, String productName, double price) {
		super(id, fn, ln, age);
		this.productName = productName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Customer [productName=" + productName + ", price=" + price + ", getId()=" + getId() + ", getFn()="
				+ getFn() + ", getLn()=" + getLn() + ", getAge()=" + getAge() + "]";
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
//		oos.writeInt(getId());
		oos.writeObject(getFn());
		oos.writeObject(getLn());
//		oos.writeInt(getAge());
		oos.close();

	}

	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		setId(ois.readInt());
		setFn((String) ois.readObject());
		setLn((String) ois.readObject());
		setAge(ois.readInt());
		ois.close();

	}

}
