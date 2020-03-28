package com.techlabs.model;

public class Account {
	private double balance;
	private static int totaltxns;
	private static int MIN_BAL;

	static {
		totaltxns = 0;
	}

	public Account(double balance) {
		this.balance = balance;

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
