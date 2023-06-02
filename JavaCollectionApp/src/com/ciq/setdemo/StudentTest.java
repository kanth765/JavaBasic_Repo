package com.ciq.setdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student(1, "prasad", "prasad@gmail.com", 15000);
		Student s2 = new Student(2, "sai", "sai@gmail.com", 20000);
		Student s3 = new Student(3, "latha", "latha@gmail.com", 18000);
		Student s4 = new Student(4, "usha", "usha@gmail.com", 17000);
		Student s5 = new Student(5, "vinay", "vinay@gmail.com", 10000);
		Student s6 = new Student(1, "prasad", "prasad@gmail.com", 15000);
//		ArrayList<Student> stds = new ArrayList<Student>();
//		LinkedList<Student>stdss=new LinkedList<Student>();
//		
		HashSet<Student> students = new HashSet<Student>();
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
		System.out.println("---------------------------------");
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(100);
		numbers.add(101);
		numbers.add(105);
		numbers.add(103);
		numbers.add(102);
		numbers.add(104);
		numbers.add(100);
		System.out.println(numbers);

	}

}
