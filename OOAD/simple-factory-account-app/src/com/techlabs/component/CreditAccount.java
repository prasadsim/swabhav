package com.techlabs.component;

public class CreditAccount extends Account {

	@Override
	public void withdraw(double amount) {
		super.setBalance(super.getBalance() - amount);
	}

}
