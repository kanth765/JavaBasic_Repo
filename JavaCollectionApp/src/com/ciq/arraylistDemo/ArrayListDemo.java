package com.ciq.arraylistDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList(); // 10
		System.out.println(arrayList.size());
		arrayList.add(100);// int or integer
		arrayList.add(100);
		arrayList.add("Array List Class"); // remove
		arrayList.add('M');
		arrayList.add(true);
		arrayList.add(null);
		arrayList.add(null);// object or value...
		arrayList.add(144.3f); // float orFLoat
		arrayList.add(2000.00);
		System.out.println(arrayList);
		System.out.println("**********************************");
		int indexOf = arrayList.indexOf(null);
		System.out.println(indexOf);
		if ( indexOf>0) {
			arrayList.add(indexOf, "welcome");
//			arrayList.set(indexOf, "hello");
			System.out.println(arrayList);
		}else {
			System.out.println("no value");
		}
		System.out.println("**********************************");

		for (int counter = 0; counter < arrayList.size(); counter++) {
			System.out.println(arrayList.get(counter));
		}

		System.out.println("**********************************");
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("**********************************");

		for (Object object : arrayList) {
			System.out.println(object);
		}
		System.out.println("**********************************");

		// java 8 lambda expression
		arrayList.forEach(System.out::println);

	}

}
