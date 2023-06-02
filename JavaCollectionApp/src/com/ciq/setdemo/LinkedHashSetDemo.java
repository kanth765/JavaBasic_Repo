package com.ciq.setdemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> capitals = new LinkedHashSet<String>();
		capitals.add("New Delhi");
		capitals.add("London");
		capitals.add("Sydeny");
		capitals.add("Newyork");
		capitals.add("Beezing");
		capitals.add("Moscow");
		capitals.add("Beezing");
		System.out.println(capitals);
	}

}
