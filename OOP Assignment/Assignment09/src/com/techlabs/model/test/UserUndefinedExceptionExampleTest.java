package com.techlabs.model.test;

import com.techlabs.model.UserUndefinedExceptionExample;

public class UserUndefinedExceptionExampleTest {

	public static void main(String[] args) {
		UserUndefinedExceptionExample u = new UserUndefinedExceptionExample();
		u.setA(10);
		u.setB(0);
		int c = u.a / u.b;
		System.out.println("Value:" + c); // it throws ArithmeticException;
	}

}
