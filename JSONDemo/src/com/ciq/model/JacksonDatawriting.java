package com.ciq.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

public class JacksonDatawriting {
	
	public void add(Object [] employees) {
		employees=new Employee[3];
	}
	
	public void remove(Employee [] employees) {
		employees=new Employee[3];
	}
	
	public void get(int id) {
		
	}
public void getAllemps(int id) {
		
	}
	

	public static void jsonWriting() throws IOException {
		Employee employee1 = new Employee(1, "anil", 1239990);
		Employee employee2 = new Employee(2, "anil", 1239990);
		Employee employee3 = new Employee(2, "anil", 1239990);
		Employee employee4 = new Employee(2, "anil", 1239990);
		Employee employee5 = new Employee(2, "anil", 1239990);
		Employee[] employees = { employee1, employee2, employee3, employee4, employee5};
		ObjectMapper objectMapper = new ObjectMapper();
		FileOutputStream fos = new FileOutputStream("emps.json");
		objectMapper.writeValue(fos, employees);
		String output = objectMapper.writeValueAsString(employees);
		System.out.println(output);
	}

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		jsonWriting();
		ObjectMapper objectMapper = new ObjectMapper();
		Employee[] employees = new Employee[2];
		FileInputStream fis = new FileInputStream("emps.json");
		employees = objectMapper.readValue(fis, Employee[].class);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}
