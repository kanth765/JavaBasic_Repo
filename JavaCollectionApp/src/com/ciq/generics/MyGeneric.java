package com.ciq.generics;

import com.ciq.needofcollection.Employee;

public class MyGeneric <Object> {

	private Object obj;

	public MyGeneric(Object obj) {
		super();
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public static void main(String[] args) {
		MyGeneric<Integer> myGen1=new MyGeneric<>(100);
//		myGen1.setObj("hello");
		System.out.println(myGen1.getObj());
		MyGeneric<String> myGen2=new MyGeneric<>("Hello");
//		myGen2.setObj(123);
		System.out.println(myGen2.getObj());
		MyGeneric<Boolean> myGen3=new MyGeneric<>(true);
//		myGen3.setObj(122);
		System.out.println(myGen3.getObj());
		MyGeneric myGen4=new MyGeneric(123.45);
		MyGeneric myGen5=new MyGeneric(111.2f);
		MyGeneric<Employee> myGen6=new MyGeneric<>(new Employee(1, "hello", 12000));
	}

}
