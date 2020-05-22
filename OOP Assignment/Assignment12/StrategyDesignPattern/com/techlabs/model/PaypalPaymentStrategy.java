package com.techlabs.model;

public class PaypalPaymentStrategy implements IPaymentStrategy {

	private String emailId;
	private String password;

	public PaypalPaymentStrategy(String email, String pwd) {
		this.emailId = email;
		this.password = pwd;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Paypal.");
	}

}
