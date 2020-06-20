package com.techlabs.component;

public class AccountFactory {

	private static AccountFactory instance;

	private AccountFactory() {
	}

	public static AccountFactory getInstance() {

		if (instance == null) {
			instance = new AccountFactory();
		}
		return instance;
	}

	public Account make(AccType type) {
		if (type == AccType.CA) {
			return new CreditAccount();
		}
		return new SavingAccount();
	}
}
