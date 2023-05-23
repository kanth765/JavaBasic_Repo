package com.ciq.autoboxing;

public class AutoboxingAndUnboxing {

	public static void main(String[] args) {

		int a = 10;
		// primitives should be convert into objects auto-boxing
//		Integer integer=new Integer(a);// deprecated code 
		// not refer to implement
		Integer.valueOf(a);// auto boxing
		
		// 
		double d=123.13;
		Double.valueOf(d); // auto boxing
		System.out.println(a);
		
		Integer value = Integer.valueOf(100);
		int b=value;
		System.out.println(b); // un boxing
		
		String input="12020";
		int i=Integer.parseInt(input);
		System.out.println(i);
		double di=Double.parseDouble(input);
		System.out.println(di);
		
		String valueOf = String.valueOf(i);
		System.out.println(valueOf);
	}

}
