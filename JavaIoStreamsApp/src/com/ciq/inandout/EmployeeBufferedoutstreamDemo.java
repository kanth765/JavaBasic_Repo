package com.ciq.inandout;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeBufferedoutstreamDemo {
	private static final String PATH = "D:\\";

	public static void main(String[] args) {

		File file = new File("emps.txt");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());

		Employee e1 = new Employee(1, "ram", 13000.00);
		Employee e2 = new Employee(1, "ram", 13000.00);
		Employee e3 = new Employee(1, "ram", 13000.00);
		Employee e4 = new Employee(1, "ram", 13000.00);

		Employee[] employees = { e1, e2, e3, e4 };

		for (Employee employee2 : employees) {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
				char[] chars = employee2.toString().toCharArray();
				bw.write(chars);
//				bw.newLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

//		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
//			char[] chars = employee.toString().toCharArray();
//			bw.write(chars);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		try (BufferedReader bis = new BufferedReader(new FileReader(file));) {
//			int i = 0;
//			while ((i = bis.read()) != -1) {
//				System.out.print((char) i);
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		}
	}

}
