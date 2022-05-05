package org.bank;

public class axisbannk extends bankinfo {
	public void deposit() {
		System.out.println("deposit 2%");
	}
	public static void main(String[] args)
	{
		axisbannk a = new axisbannk();
		a.saving();
		a.deposit();
		a.fixed();
	}

}
