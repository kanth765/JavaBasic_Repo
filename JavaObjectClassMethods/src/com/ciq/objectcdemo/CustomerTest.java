package com.ciq.objectcdemo;

public class CustomerTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Oreder oreder = new Oreder(12458888, "in Progress");
		Address address = new Address("hyd", "Ts", "500038");
		Customer originalObject = new Customer(1, "anil", address, oreder);
		System.out.println(originalObject);
		Customer clonedObject = (Customer) originalObject.clone();
		System.out.println(clonedObject);
		System.out.println("-----------------------");
		originalObject.setId(100);
		originalObject.setName("anil kumar");
		originalObject.getAddress().setCity("pune");
		originalObject.getAddress().setState("MH");
		originalObject.getAddress().setZipCode("400087");
		originalObject.getOrderstatus().setOrderStatus("Delivered");
		System.out.println(originalObject);
		System.out.println(clonedObject);

//		 CustomerTest ct=new CustomerTest();
//		 ct.clone();
	}

}
