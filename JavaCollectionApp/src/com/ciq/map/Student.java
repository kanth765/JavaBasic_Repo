package com.ciq.map;

import java.util.Date;
import java.util.List;

public class Student {

	private int id;
	private String name;
	private Date dob;
	private List<Course> courses;

	public Student() {
	}

	public Student(int id, String name, Date dob, List<Course> courses) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.courses = courses;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dob=" + StudentDobFormatter.getDateMMDDYYY(dob) + ", courses=" + courses + "]";
	}

}
