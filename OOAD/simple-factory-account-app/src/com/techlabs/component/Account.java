package com.techlabs.component;

public abstract class Account {

	private int accno;
	private String name;
	private double balance;

	public Account() {}
	
	public void deposit(double amount) {
		this.balance+=amount;		
	}
	
	public abstract void withdraw(double amount) throws LowBalanceException;

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
