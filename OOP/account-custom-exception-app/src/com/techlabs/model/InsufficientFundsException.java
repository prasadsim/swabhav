package com.techlabs.model;

public class InsufficientFundsException extends Exception {
//	public InsufficientFundsException(Account acc) {
//		super("The Account Holder:" + acc.getName() + "\nAccount Number:" + acc.getAccNo() + "\nBalance:"
//				+ acc.getBalance() + "\nTries to withdraw with amount:" + acc.getAmt()
//				+ "\nBut, The Minimum Balance of the AccountHolder Should be:" + acc.getMinBal()
//				+ "\nSo the Transaction is Not Possible!!!");
//	}

	public InsufficientFundsException(String msg) {
		System.out.println(msg);
	}
}
