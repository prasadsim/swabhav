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

	public void withdraw(double amt) throws Exception {
		totaltxns++;
		if (this.balance - amt > this.MIN_BAL) {
			this.balance -= amt;
		} else {
			throw new RuntimeException("Account Balance is low for withdraw!");
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

	public String getName() {
		return name;
	}

	public int getAccno() {
		return accno;
	}

}
