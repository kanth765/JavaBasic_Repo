package com.ciq.objectcdemo;

public class Customer implements Cloneable {

	private int id;
	private String name;
	private Address address;
	private Oreder orderstatus;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, Address address) {

		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Customer(int id, String name, Address address, Oreder orderstatus) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.orderstatus = orderstatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Oreder getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(Oreder orderstatus) {
		this.orderstatus = orderstatus;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", orderstatus=" + orderstatus + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer cloned = (Customer) super.clone();
		cloned.setAddress((Address) cloned.getAddress().clone());
		cloned.setOrderstatus((Oreder)cloned.getOrderstatus().clone());
		return cloned;
	}

//	public static void main(String[] args) throws CloneNotSupportedException {
//		Customer originalObject = new Customer(1, "anil", "hyd");
//		System.out.println(originalObject);
//		Customer clonedObject = (Customer) originalObject.clone();
//		System.out.println(clonedObject);
//		System.out.println("-----------------------");
//		originalObject.setName("anil kumar");
//		System.out.println(originalObject);
//		System.out.println(clonedObject);
//	}

}
