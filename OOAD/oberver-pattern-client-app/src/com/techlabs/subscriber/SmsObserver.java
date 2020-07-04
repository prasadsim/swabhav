package com.techlabs.subscriber;

import com.techlabs.publisher.Account;
import com.techlabs.publisher.IBalanceObserver;

public class SmsObserver implements IBalanceObserver {

	@Override
	public void update(Account acc) {
		System.out.println("Inside " + this.getClass().getSimpleName());
		System.out.println("Balance changed to " + acc.getBalance() + " from " + acc.getName());
		System.out.println("Sms is been send!!!\n");
	}

}
