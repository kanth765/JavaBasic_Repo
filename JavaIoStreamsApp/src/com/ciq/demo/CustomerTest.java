package com.ciq.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomerTest {

	public static void writeData(Customer customer) {
		try (FileOutputStream fos = new FileOutputStream("customer.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(customer);
			System.out.println("successs!!!!");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public static void readData() {
		try (FileInputStream fis = new FileInputStream("customer.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			Customer customer = (Customer) ois.readObject();
			System.out.println(customer.getAge());
			System.out.println(customer.getId());
			System.out.println(customer.getFn());
			System.out.println(customer.getLn());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Customer customer = new Customer(1, "ram", "b", 24, "laptop", 25000.00);
		writeData(customer);
		readData();

	}
}
