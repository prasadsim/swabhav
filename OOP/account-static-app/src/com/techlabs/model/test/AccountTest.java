package com.techlabs.model.test;

import com.techlabs.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		
		Account acc1 = new Account(5000);
		acc1.withdraw(1000);
		System.out.println("Transaction NO:" + Account.getTotalTxns());
		
		Account acc2 = new Account(510);
		acc2.withdraw(11);
		System.out.println("Transaction NO:" + Account.getTotalTxns());
		
		Account.setMinBal(1000);
		System.out.println("Min bal:" + Account.getMinBal());
		
		Account acc3 = new Account(1001);
		acc3.withdraw(2);
		System.out.println("Transaction NO:" + Account.getTotalTxns());
		

	}
}
