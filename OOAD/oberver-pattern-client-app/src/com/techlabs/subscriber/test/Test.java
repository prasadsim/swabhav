package com.techlabs.subscriber.test;

import com.techlabs.publisher.Account;
import com.techlabs.subscriber.EmailObserver;
import com.techlabs.subscriber.SmsObserver;

public class Test {

	public static void main(String[] args) {

		Account acc1 = new Account(101, "abc", 5000);
		
		acc1.addBalanceObserver(new SmsObserver());
		acc1.addBalanceObserver(new EmailObserver());

		acc1.deposit(1000);
		
		acc1.withdraw(4000);
	}
}
