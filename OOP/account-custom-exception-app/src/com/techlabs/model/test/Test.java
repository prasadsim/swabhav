package com.techlabs.model.test;

import com.techlabs.model.*;

public class Test {

	public static void main(String[] args) throws InsufficientFundsException {

		Account acc1 = new Account(101, "Ash", 1000);
		acc1.setMinBal(500);
		try {
			acc1.withdraw(600);
		} catch (InsufficientFundsException e) {
		} catch (Exception ex) {
//			System.out.println(ex.getMessage());
		}
		System.out.println("End of Main");
	}
}
