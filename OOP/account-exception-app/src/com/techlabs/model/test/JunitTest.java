package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.techlabs.model.Account;

class JunitTest {
	Account acc1 = new Account(101, "Ash", 1000);

	@Test
	void testAccountNumber() {
		assertEquals(101, acc1.getAccno());
	}

	void testAccountName() {
		assertEquals("Ash", acc1.getName());
	}

	void testAccountBalance() {
		assertEquals(1000, acc1.getBalance());
	}

	void testAccountBalanceAfterDeposit() {
		acc1.deposit(500);
		assertEquals(1500, acc1.getBalance());
	}

	void testAccoutBalanceAfterWithdraw() throws Exception {
		acc1.withdraw(700);
		assertEquals(800, acc1.getBalance());
	}

	void testAccoutBalanceAfterWithdrawWithCheckingException() throws Exception {
		String expectedException = "Account Balance is low for withdraw!";
		acc1.setMinBal(500);
		try {
			acc1.withdraw(400);
		} catch (RuntimeException e) {
			assertEquals(expectedException, e.getMessage());
		}
	}

}
