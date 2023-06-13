package com.ciq.generics;

public abstract class Player {

	private int id;
	private String firstName;
	private String lastName;
	private int year;
	
	
	public Player(int id, String firstName, String lastName, int year) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
	}


	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public String toString() {
		return "Player [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", year=" + year + "]";
	}


	
	
	
	

}
