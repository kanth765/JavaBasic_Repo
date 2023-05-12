package com.ciq.inandout;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printerWriterDemo {
	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(new FileWriter("writer.txt"));
		out.println(10);
		out.println("hello writer");
		out.println(true);
		out.println(20.00);
		out.flush();
		out.close();

	}

}
