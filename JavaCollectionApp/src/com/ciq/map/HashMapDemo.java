package com.ciq.map;

import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap objects=new HashMap();
		objects.put(null, "India");
		objects.put("New delhi", "India");
		objects.put(123, "India");
		objects.put(200, "Http status code success");
		objects.put(500, "Http status code failure");
		objects.put("Moscow", "Russia");
		objects.put(true, "Russia");
		objects.put(null, "createiq");
		objects.put(123, "createiq");
		objects.put(1, null);
		objects.put(2, null);
		
		System.out.println(objects);
		
	}

}
