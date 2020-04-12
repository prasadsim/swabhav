package com.techlabs.model;

import java.text.ParseException;

public class CurrentAccount extends Account {
	final int MINBAL = -5000;

	public CurrentAccount(int accno, String name, double balance, String creationDate, String dateOfBirth)
			throws ParseException {
		super(accno, name, balance, creationDate, dateOfBirth);
	}

	@Override
	public void withdraw(int amt) {
		if ((this.balance - amt) > MINBAL) {
			this.balance = this.balance - amt;
		}
		return;
	}

	@Override
	public String getAccountType() {
		return "CurrentAccount";
	}
}
