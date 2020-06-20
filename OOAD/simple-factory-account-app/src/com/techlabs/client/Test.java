package com.techlabs.client;

import com.techlabs.component.AccType;
import com.techlabs.component.Account;
import com.techlabs.component.AccountFactory;
import com.techlabs.component.LowBalanceException;

public class Test {

	public static void main(String[] args) throws LowBalanceException {
		AccountFactory factory = AccountFactory.getInstance();
		Account acc = factory.make(AccType.CA);
		acc.setAccno(101);
		acc.setName("abc");
		acc.deposit(10000);
		acc.withdraw(100000);
		printInfo(acc);

		Account acc1 = factory.make(AccType.SA);
		acc1.setAccno(102);
		acc1.setName("xyz");
		acc1.deposit(1000);
		acc1.withdraw(400);
		printInfo(acc1);
	}

	private static void printInfo(Account acc) {
		System.out.println(acc.getClass().getSimpleName());
		System.out.println(
				"Name:" + acc.getName() + "\nAccountNumber:" + acc.getAccno() + "\nBalance:" + acc.getBalance() + "\n");
	}

}
