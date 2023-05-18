package com.ciq.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis1=new FileInputStream("emp.json");
		FileInputStream fis2=new FileInputStream("employee.json");
		FileInputStream fis3=new FileInputStream("emp.json");
		Vector vector = new Vector();
		System.out.println(vector.capacity());
		vector.addElement(11);
		vector.addElement(true);
		vector.addElement(123.34);
		vector.addElement(null);
		vector.addElement(new Employee(12, "anil", 12000));
		Enumeration enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			Object object = (Object) enumeration.nextElement();
			System.out.println(object);
		}
		
//		vector.addElement(fis1);
//		vector.addElement(fis2);
//		vector.add(fis3);
		System.out.println(vector);
//		Enumeration enumeration = vector.elements();
//		SequenceInputStream siq=new SequenceInputStream(enumeration);
//		int i=0;
//		while((i=siq.read())!=-1) {
//			System.out.print((char) i);
//		}
		
	}

}
