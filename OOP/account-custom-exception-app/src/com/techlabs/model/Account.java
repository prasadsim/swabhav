package com.techlabs.model;

public class Account {
	private String name;
	private int accno;
	private double balance;
	private static int totaltxns;
	private static int MIN_BAL;
	private double amt;

	static {
		totaltxns = 0;
	}

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public void withdraw(double amt) throws InsufficientFundsException {
		totaltxns++;
		String exceptionMsg = "The Account Holder:" + this.getName() + "\nAccount Number:" + this.getAccNo()
				+ "\nBalance:" + this.getBalance() + "\nTries to withdraw with amount:" + this.getAmt()
				+ "\nBut, The Minimum Balance of the AccountHolder Should be:" + this.getMinBal()
				+ "\nSo the Transaction is Not Possible!!!";
		this.amt = amt;
		if (this.balance - amt > this.MIN_BAL) {
			this.balance -= amt;
		} else {
//			throw new InsufficientFundsException(this);
			throw new InsufficientFundsException(exceptionMsg);
		}
	}

	public void deposit(double amt) {
		totaltxns++;
		this.amt = amt;
		this.balance += amt;
		System.out.println("After Deposit Balance:" + this.balance);
	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public int getAccNo() {
		return accno;
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

	public double getAmt() {
		return amt;
	}

}
