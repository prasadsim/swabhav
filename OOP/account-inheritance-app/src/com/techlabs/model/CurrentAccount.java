package com.techlabs.model;

public class CurrentAccount extends Account {
	final int MINBAL = -5000;

	public CurrentAccount(int accno, String name, double balance) {
		super(accno, name, balance);
	}

	@Override
	public void withdraw(int amt) {
		if ((this.balance - amt) > MINBAL) {
			this.balance = this.balance - amt;
		}
		return;
	}
}
