package com.ciq.serializationdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int acNo;
	private String acName;
	private double balance;
	private transient int charges;
	private transient String profilePassword;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int acNo, String acName, double balance, int charges, String profilePassword) {
		super();
		this.acNo = acNo;
		this.acName = acName;
		this.balance = balance;
		this.charges = charges;
		this.profilePassword = profilePassword;
	}

	public int getAcNo() {
		return acNo;
	}

	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}

	public String getAcName() {
		return acName;
	}

	public void setAcName(String acName) {
		this.acName = acName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getCharges() {
		return charges;
	}

	public void setCharges(int charges) {
		this.charges = charges;
	}

	public String getProfilePassword() {
		return profilePassword;
	}

	public void setProfilePassword(String profilePassword) {
		this.profilePassword = profilePassword;
	}

	@Override
	public String toString() {
		return "Account [acNo=" + acNo + ", acName=" + acName + ", balance=" + balance + ", charges=" + charges
				+ ", profilePassword=" + profilePassword + "]";
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account account = new Account(2023011324, "anil", 1000, 15, "anil12345");
		System.out.println(account);
		FileOutputStream fos = new FileOutputStream("account.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(account);
		oos.flush();
		oos.close();

		FileInputStream fis = new FileInputStream("account.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Account account2 = (Account) obj;
		System.out.println(account2);

	}

}
