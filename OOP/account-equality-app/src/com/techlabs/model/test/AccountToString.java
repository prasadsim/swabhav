package com.techlabs.model.test;

import com.techlabs.model.Account;

public class AccountToString {
	public static void main(String[] args) {
		
		Account acc1 = new Account(1001,"ASH",5000);
		System.out.println(acc1);
		System.out.println(acc1.toString());
	}

}
