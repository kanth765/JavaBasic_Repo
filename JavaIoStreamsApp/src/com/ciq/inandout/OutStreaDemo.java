package com.ciq.inandout;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutStreaDemo {
//bytes
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("D:\\test.txt");
//			String msg = "hello i'm file out stream class";
			fos.write(10);
			System.out.println("success");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("close the resource");
			if (fos != null)
				fos.close();
		}

	}
}
