package com.ciq.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class EmployeeTest {

	public static void main(String[] args) throws IOException {

		Employee employee = new Employee(1, "anil", 1239990);
		System.out.println(employee);
		Gson gson = new Gson();
		String json = gson.toJson(employee);

		FileWriter fw = new FileWriter("employee.json");
		gson.toJson(employee, fw);
		fw.close();
		System.out.println(json);

	}

}
