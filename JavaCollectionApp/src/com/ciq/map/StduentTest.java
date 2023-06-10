package com.ciq.map;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StduentTest {

	public static void main(String[] args) throws ParseException {
		Course c1 = new Course(1, 60, "Python");
		Course c2 = new Course(3, 45, "Java script");
		Course c3 = new Course(2, 180, "Java Regular course");
		Course c4 = new Course(4, 50, "Angular");

		List<Course> coursesOfPython = new ArrayList<Course>();
		coursesOfPython.add(c1);
		coursesOfPython.add(c2);
		
		Collections.sort(coursesOfPython, new Comparator<Course>() {

			@Override
			public int compare(Course o1, Course o2) {
				return o1.getCourseName().compareTo(o2.getCourseName());
			}
		});
		
		List<Course> coursesOfJava = new ArrayList<Course>();
		coursesOfJava.add(c3);
		coursesOfJava.add(c4);
		
		
		// mm/dd/yyyy
		// dd/mm/yyyy
		String dob1 = "12/03/1990";
		String dob2 = "12/03/1980";
		String dob3 = "12/03/1993";
		String dob4 = "12/03/1994";
		String dob5 = "12/03/1995";
		SimpleDateFormat simpleDateFormatter = new SimpleDateFormat("mm/dd/yyyy");
		Date date1 = simpleDateFormatter.parse(dob1);
		Date date2 = simpleDateFormatter.parse(dob2);
		Date date3 = simpleDateFormatter.parse(dob3);
		Date date4 = simpleDateFormatter.parse(dob5);
		Date date5 = simpleDateFormatter.parse(dob4);

		Student s1 = new Student(100, "ram", date1, coursesOfPython);
		Student s2 = new Student(102, "sita", date2, coursesOfPython);
		Student s3 = new Student(103, "aravind", date3, coursesOfJava);
		Student s4 = new Student(101, "charvy", date4, coursesOfJava);

		Map<Student, LocalDate> studentsMap = new HashMap<Student, LocalDate>( );
		LocalDate joingDate = LocalDate.of(2023, 05, 10);
		LocalDate joingDate2 = LocalDate.of(2023, 06, 01);
		studentsMap.put(s1, joingDate);
		studentsMap.put(s2, joingDate);
		studentsMap.put(s3, joingDate);
		studentsMap.put(s4, joingDate2);

		for (Map.Entry<Student, LocalDate> entry : studentsMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
		System.out.println("*******************************************************");
		
		Map<Student, LocalDate> studentsMap2 = new TreeMap<Student, LocalDate>(new StudentNameCompartor() );
		studentsMap2.put(s1, joingDate);
		studentsMap2.put(s2, joingDate);
		studentsMap2.put(s3, joingDate);
		studentsMap2.put(s4, joingDate2);

		for (Map.Entry<Student, LocalDate> entry : studentsMap2.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}

	}

}
