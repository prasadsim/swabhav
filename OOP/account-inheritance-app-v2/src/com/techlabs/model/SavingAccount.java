package com.techlabs.model;

import java.text.ParseException;

public class SavingAccount extends Account {

	final int MINBAL = 1000;

	public SavingAccount(int accno, String name, double balance, String creationDate, String dateOfBirth)
			throws ParseException {
		super(accno, name, balance, creationDate, dateOfBirth);
	}

	@Override
	public void withdraw(int amt) {
		if ((this.balance - amt) > MINBAL) {
			this.balance = this.balance - amt;
		}
		System.out.println("Account Balance is Low");
		return;
	}

	@Override
	public String getAccountType() {
		return "SavingAccount";
	}

}
