package com.techlabs.model;

public class Account {
	private double balance;
	private static int MIN_BAL;
//
//	static {
//		MIN_BAL = 500;
//	}

	public Account(double balance) {
		this.balance = balance;

	}

	public void withdraw(double amt) {
		if (this.balance - amt > this.MIN_BAL) {
			this.balance = this.balance - amt;
			System.out.println("Balance:" + this.balance);
		} else {
			System.out.println("you got Min balance" + this.balance);
		}
	}
	
	public static void setMinBal(int min_bal) {
		MIN_BAL=min_bal;
	}
	
	public static int getMinBal() {
		return MIN_BAL;
	}

}
