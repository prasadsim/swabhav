package com.techlabs.model.test;

import com.techlabs.model.Account;

public class AccountEquality {
	public static void main(String[] args) {

		Account acc1 = new Account(101, "Ash", 5000);
		Account acc2 = new Account(101, "Ash", 5000);

		System.out.println(acc1.hashCode());
		System.out.println(acc2.hashCode());

		Account acc3 = acc1;

		System.out.println(acc1 == acc1); // t
		System.out.println(acc1 == acc2); // f
		System.out.println(acc3 == acc1); // t

		System.out.println();

		System.out.println(acc1.equals(acc1)); // t
		System.out.println(acc1.equals(acc2)); // t
		System.out.println(acc3.equals(acc1)); // t
	}
}
