package com.ciq.demo;

public class Student extends Person {

	private String course;
	private String email;
	private transient String password;

	public Student(int id, String fn, String ln, int age, String course, String email, String password) {
		super(id, fn, ln, age);
		this.course = course;
		this.email = email;
		this.password = password;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", email=" + email + ", getId()=" + getId() + ", getFn()=" + getFn()
				+ ", getLn()=" + getLn() + ", getAge()=" + getAge() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	 

}
