package com.ciq.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashDemo {

	public static void main(String[] args) {
		HashMap hashMap = new HashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		hashMap.put(i1, "pavan");
		hashMap.put(i2, "kalyan");
		System.out.println(hashMap);// {10=kalyan}
		
		
		IdentityHashMap ide = new IdentityHashMap();
//		Integer i3 = new Integer(10);
//		Integer i4 = new Integer(10);
		ide.put(i1, "pavan");
		ide.put(i2, "kalyan");
		System.out.println(ide);// {10=kalyan}



	}

}
