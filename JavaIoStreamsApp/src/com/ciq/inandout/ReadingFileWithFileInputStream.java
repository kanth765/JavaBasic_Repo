package com.ciq.inandout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFileWithFileInputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\msg.txt");
		// 0 to nth index
		int i = 0;
		while ((i = fis.read()) != -1) {
			System.out.print((char) i);
		}
		fis.close();
	}

}
