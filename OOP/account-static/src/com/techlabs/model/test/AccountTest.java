package com.techlabs.model.test;

import com.techlabs.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account acc1 = new Account(5000);
		acc1.withdraw(1000);
		Account acc2 = new Account(510);
		acc2.withdraw(11);
		Account.setMinBal(1000);
		System.out.println("Min bal:"+Account.getMinBal());
	}
}
