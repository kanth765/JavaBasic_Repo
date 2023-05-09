package com.ciq.inandout;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
// write the data into character
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("writer.txt");) {
			fw.write("welcome to file writer class demo");
			System.out.println("success!!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
