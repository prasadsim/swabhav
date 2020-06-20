package com.techlabs.component;

public class SavingAccount extends Account {

	private double MINBAL = 500;

	@Override
	public void withdraw(double amount) throws LowBalanceException {
		if (super.getBalance() - amount < this.MINBAL) {
			throw new LowBalanceException("Balance is Low for WithDraw!!!");
		} else {
			super.setBalance(super.getBalance() - amount);
		}
	}

}
