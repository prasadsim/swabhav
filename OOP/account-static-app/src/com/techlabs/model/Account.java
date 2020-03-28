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
		totaltxns++;
		if (this.balance - amt > this.MIN_BAL) {
			this.balance -= amt;
			System.out.println("Balance:" + this.balance);
		} else {
			System.out.println("you got Min balance" + this.balance);
		}
	}

	public void deposit(double amt) {
		totaltxns++;
		this.balance += amt;
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
