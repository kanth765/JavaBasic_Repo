package com.ciq.arraylistDemo;

import java.util.Comparator;

import com.ciq.needofcollection.Employee;

public class Mycomparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getId()-o1.getId();
	}

}
