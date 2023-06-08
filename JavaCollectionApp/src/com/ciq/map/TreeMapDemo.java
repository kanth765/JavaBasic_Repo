package com.ciq.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.ciq.arraylistDemo.Mycomparator;
import com.ciq.needofcollection.Employee;

public class TreeMapDemo {

	public static void main(String[] args) {
//		TreeSet<Employee> employees=new TreeSet<Employee>(new Mycomparator());
//		employees.add(new Employee(1, "anil", 12000.00));
//		employees.add(new Employee(3, "balu", 13000.00));
//		employees.add(new Employee(4, "dharma", 11000.00));
//		employees.add(new Employee(2, "charvy", 15000.00));
//		System.out.println(employees);

		TreeMap<String, Employee> treeMapdemo = new TreeMap<String, Employee>();
		treeMapdemo.put("Ciqemp001", new Employee(1, "anil", 12000.00));
		treeMapdemo.put("Ciqemp003", new Employee(2, "balu", 13000.00));
		treeMapdemo.put("Ciqemp004", new Employee(4, "dharma", 11000.00));
		treeMapdemo.put("Ciqemp002", new Employee(3, "charvy", 15000.00));

		System.out.println(treeMapdemo);

		TreeMap<Employee, String> treeMapdemo2 = new TreeMap<>(new Mycomparator());
		treeMapdemo2.put(new Employee(1, "anil", 12000.00), "Ciqemp001");
		treeMapdemo2.put(new Employee(2, "balu", 13000.00), "Ciqemp003");
		treeMapdemo2.put(new Employee(4, "dharma", 11000.00), "Ciqemp004");
		treeMapdemo2.put(new Employee(3, "charvy", 15000.00), "Ciqemp002");
		treeMapdemo2.put(new Employee(), "");

		System.out.println(treeMapdemo2);
		Set<Employee> keySet = treeMapdemo2.keySet();
		for (Map.Entry<Employee, String> emps : treeMapdemo2.entrySet()) {
			Employee key = emps.getKey();
//			String empId=emps.getValue();
//			if (empId==null && empId.isBlank()) 
			if(key.getId()==0 && key.getName().isBlank()&& key.getSalary()==0.0)
			{
				throw new NullPointerException("employee not found....");
			} else {
				System.out.println(emps.getKey() + " " + emps.getValue());
			}
		}

	}

}
