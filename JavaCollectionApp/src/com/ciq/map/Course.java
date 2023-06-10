package com.ciq.map;

public class Course {

	private int id;
	private int coursePeriod;
	private String courseName;

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(int id, int coursePeriod, String courseName) {
		super();
		this.id = id;
		this.coursePeriod = coursePeriod;
		this.courseName = courseName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCoursePeriod() {
		return coursePeriod;
	}

	public void setCoursePeriod(int coursePeriod) {
		this.coursePeriod = coursePeriod;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", coursePeriod=" + coursePeriod + ", courseName=" + courseName + "]";
	}

}
