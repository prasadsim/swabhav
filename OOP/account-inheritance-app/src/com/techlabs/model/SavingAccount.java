package com.techlabs.model;

public class SavingAccount extends Account {

	final int MINBAL = 1000;

	public SavingAccount(int accno, String name, double balance) {
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
