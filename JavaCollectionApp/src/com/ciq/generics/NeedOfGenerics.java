package com.ciq.generics;

import java.util.ArrayList;

public class NeedOfGenerics {

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
		
		
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		arrayList2.add(100);// int or integer
		arrayList2.add(100);
//		arrayList2.add("Array List Class"); // remove
//		arrayList2.add('M');
//		arrayList2.add(true);
//		arrayList2.add(null);
//		arrayList2.add(null);// object or value...
//		arrayList2.add(144.3f); // float orFLoat
//		arrayList2.add(2000.00);

		int sum = 0;
		for (Integer obj : arrayList2) {
//			Integer i = (Integer) obj;
			sum = sum + obj;
		}
		System.out.println(sum);

	}

}
