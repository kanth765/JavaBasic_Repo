package com.ciq.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student(1, "anil", "b", 23, "java full stack", "anil@ciq.com", "12345");

		try (FileOutputStream fos = new FileOutputStream("student.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(student);
			System.out.println("successs!!!!");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream("student.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			Student stu = (Student) ois.readObject();
			System.out.println(stu);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
