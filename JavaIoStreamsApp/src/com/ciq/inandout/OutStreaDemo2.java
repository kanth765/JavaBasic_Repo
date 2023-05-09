package com.ciq.inandout;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutStreaDemo2 {
// try with resource in java exception feature jdk 1.7 version

	// auto closeable --> resource closing automatically
	public static void main(String[] args) throws IOException {
		try (FileOutputStream fos = new FileOutputStream("D:\\test.txt");) {
			String msg = "hello i'm file out stream class";
			fos.write(msg.getBytes());
			System.out.println("success");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}
}
