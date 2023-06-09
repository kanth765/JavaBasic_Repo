package com.ciq.needofcollection;

public class Employee {
//	implements Comparable<Employee> 
	private Integer id;
	private String name;
	private Double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
//		if(id)
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

//	@Override
//	public int compareTo(Employee o) {
////		return this.getId() - o.getId();
//		return this.getName().compareTo(o.getName());
//	}

}
