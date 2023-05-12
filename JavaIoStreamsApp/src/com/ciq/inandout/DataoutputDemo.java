package com.ciq.inandout;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataoutputDemo {

	public static void main(String[] args) throws IOException {

		DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
		dos.writeInt(10);
		dos.writeDouble(20.00);
		dos.writeBoolean(true);
		dos.writeUTF("hello data output stream");
		dos.close();

		DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
		int a=dis.readInt();
		System.out.println(a);
		double d=dis.readDouble();
		System.out.println(d);
		String msg = dis.readLine();
		System.out.println(msg);
	}

}
