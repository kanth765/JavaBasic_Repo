package com.ciq.vectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector vector = new Vector();
		System.out.println(vector.capacity());
		vector.addElement("white");
		vector.addElement("red");
		vector.addElement("blue");
		vector.addElement("black");
		System.out.println(vector.get(0));
		System.out.println(vector.get(3));
//		if(vector.contains("yellow")) {
//			System.out.println(vector);
//		}else {
//			System.out.println("no color");
//		}
//		vector.addElement(10);
//		vector.addElement(11.123);
//		vector.addElement(null);
//		vector.addElement('c');
//		vector.addElement(11.123);
//		vector.addElement(null);
//		vector.addElement('c');
//		vector.add('A');
		System.out.println(vector.capacity());
		System.out.println(vector.size());
		System.out.println(vector);

		Enumeration elements = vector.elements();
		while (elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
		System.out.println("**********************************");

		Iterator iterator = vector.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			String color = (String) next;
			if (color.equals("blue"))
				System.out.println(color);

		}
		System.out.println("**********************************");

		for (Object object : vector) {
			String color = (String) object;
			if (color.equals("blue"))
				System.out.println(color);
		}

		Vector vector2 = new Vector();
		vector2.addElement(10);
		vector2.addElement(20);
		vector2.addElement(30);
		vector2.addElement(40);
		int sum = 0;
		for (Object object : vector2) {
			Integer value = (Integer) object;
			sum = sum + value;
		}
		System.out.println("**********************************");
		System.out.println(sum);

		Vector vector3 = new Vector(vector);
		vector3.add(vector2);
		System.out.println(vector3);
	}

}
