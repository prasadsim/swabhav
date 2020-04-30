package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.*;

class AccountJunitTest {
	Account acc = new Account(101, "Ash", 1000);

	@Test
	void testAccountNumber() {
		assertEquals(101, acc.getAccNo());
	}

	void testAccountName() {
		assertEquals("Ash", acc.getName());
	}

	void testAccountBalance() {
		assertEquals(1000, acc.getBalance());
	}

	void testAccountBalanceAfterDeposit() {
		acc.deposit(500);
		assertEquals(1500, acc.getBalance());
	}

	void testAccoutBalanceAfterWithdraw() throws Exception {
		acc.withdraw(700);
		assertEquals(800, acc.getBalance());
	}

	void testAccoutBalanceAfterWithdrawWithCheckingException() throws Exception {
		acc.setMinBal(500);
		String expectedException = "The Account Holder:" + acc.getName() + "\nAccount Number:" + acc.getAccNo()
				+ "\nBalance:" + acc.getBalance() + "\nTries to withdraw with amount:" + acc.getAmt()
				+ "\nBut, The Minimum Balance of the AccountHolder Should be:" + acc.getMinBal()
				+ "\nSo the Transaction is Not Possible!!!";
		try {
			acc.withdraw(400);
		} catch (InsufficientFundsException e) {
			assertEquals(expectedException, e.getMessage());
		}
	}

}
