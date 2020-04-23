package com.techlabs.model.test;

import com.techlabs.model.UserDefineExceptionExample;

public class UserDefineExceptionExampleTest {

	public static void main(String[] args) {

		UserDefineExceptionExample u = new UserDefineExceptionExample();
		u.setA(10);
		u.setB(0);

		try {
			if (u.b == 0) {
				throw new ExampleException("Divide by zero Exception");
			} else {
				int c = u.a / u.b;
				System.out.println("Value:" + c);
			}
		}

		catch (ExampleException e) {
			System.out.println("Error " + e.getMessage());
		}
	}

}
