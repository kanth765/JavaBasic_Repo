package com.ciq.demo;

import java.io.Serializable;

public class Person {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
	private int id;
	private String fn;
	private String ln;
	private int age;

	public Person() { // TODO Auto-generated constructor stub
	}

	public Person(int id, String fn, String ln, int age) {
		super();
		this.id = id;
		this.fn = fn;
		this.ln = ln;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", fn=" + fn + ", ln=" + ln + ", age=" + age + "]";
	}

}
