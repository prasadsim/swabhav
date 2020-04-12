package com.techlabs.model;

public abstract class Account {
	private int accno;
	private String name;
	protected double balance;

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(int amt) {
		this.balance = this.balance + amt;
	}

	public abstract void withdraw(int amt);
	
	public int getAccno() {
		return accno;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
}
