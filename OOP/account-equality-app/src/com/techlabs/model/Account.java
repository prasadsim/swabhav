package com.techlabs.model;

public class Account {
	private String name;
	private int accno;
	private double balance;
	private static int totaltxns;
	private static int MIN_BAL;

	static {
		totaltxns = 0;
	}

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public Account(double balance) {
		this.balance = balance;

	}

	public boolean equals(Account a_obj) {
		if (this.name.equalsIgnoreCase(a_obj.name) && this.accno == a_obj.accno && this.balance == a_obj.balance) {
			return true;
		}
		return false;

	}

	@Override
	public String toString() {
		String s = super.toString() + "\nAccNo:" + accno + "\nName:" + name + "\nBalance:" + balance;
		return s;
	}

	public void withdraw(double amt) {
		System.out.println("Account Balance:" + this.balance);
		totaltxns++;
		if (this.balance - amt > this.MIN_BAL) {
			this.balance -= amt;
			System.out.println("After WithDraw Balance:" + this.balance);
		} else {
			System.out.println("Invalid Txns coz yours balance:" + this.balance);
		}
	}

	public void deposit(double amt) {
		totaltxns++;
		this.balance += amt;
		System.out.println("After Deposit Balance:" + this.balance);
	}

	public double getBalance() {
		return balance;
	}

	public static int getTotalTxns() {
		return totaltxns;
	}

	public static void setMinBal(int min_bal) {
		MIN_BAL = min_bal;
	}

	public static int getMinBal() {
		return MIN_BAL;
	}

}
