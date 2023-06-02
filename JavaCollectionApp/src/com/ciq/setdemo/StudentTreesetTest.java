package com.ciq.setdemo;

import java.util.Iterator;
import java.util.TreeSet;

public class StudentTreesetTest {

	public static void main(String[] args) {
		Student s1 = new Student(1, "prasad", "prasad@gmail.com", 15000);
		Student s2 = new Student(2, "sai", "sai@gmail.com", 20000);
		Student s3 = new Student(3, "latha", "latha@gmail.com", 18000);
		Student s4 = new Student(4, "usha", "usha@gmail.com", 17000);
		Student s5 = new Student(5, "vinay", "vinay@gmail.com", 10000);
		Student s6 = new Student(1, "prasad", "prasad@gmail.com", 15000);

		TreeSet<Student> students = new TreeSet<Student>(new StudentIDComparator());
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);

		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
