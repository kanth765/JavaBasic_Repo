package com.ciq.inandout;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceINputDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("emps.txt");
		FileInputStream fis2 = new FileInputStream("hello.txt");
	
		
		SequenceInputStream sq = new SequenceInputStream(fis1, fis2);
		int i = 0;
		while ((i = sq.read()) != -1) {
			System.out.print((char) i);
		}
		

	}

}
