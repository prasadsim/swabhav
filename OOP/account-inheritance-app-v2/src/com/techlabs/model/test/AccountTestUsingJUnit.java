package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

import com.techlabs.model.*;

class AccountTestUsingJUnit {

	AccountTest a = new AccountTest();

	@Test
	public void test_RichestAccountHolder() throws ParseException {
		// Arrange
		SavingAccount sa1 = new SavingAccount(1001, "prasad", 5000, "04/12/2020", "02/26/1998");
		SavingAccount sa2 = new SavingAccount(1002, "sarthak", 4000, "04/11/2020", "07/26/1978");
		SavingAccount sa3 = new SavingAccount(1003, "hemant", 5500, "04/18/2020", "10/26/1989");
		CurrentAccount ca1 = new CurrentAccount(1022, "Ash", 6000, "04/07/2020", "04/20/1999");
		CurrentAccount ca2 = new CurrentAccount(1012, "Sim", 5900, "04/20/2020", "08/20/2000");

		Account[] acc = { sa1, sa2, sa3, ca1, ca2 };

		// Act
		String actualRichAccHolderName = a.findRichestAccountHolder(acc).getName();
		String exceptedRichAccHolderName = "Ash";

		// Assert
		assertEquals(exceptedRichAccHolderName, actualRichAccHolderName);
	}

	public void test_withdrawOfSavingAndCurrentAccount() throws ParseException {
		// Arrange
		SavingAccount sa1 = new SavingAccount(1001, "prasad", 5000, "04/12/2020", "02/26/1998");
		CurrentAccount ca1 = new CurrentAccount(1022, "Ash", 6000, "04/07/2020", "04/20/1999");

		sa1.withdraw(500);
		ca1.withdraw(500);

		// Act
		double actualWithdrawAmountOfSavingAccount = sa1.getBalance();
		double actualWithdrawAmountOfCurrentAccount = ca1.getBalance();

		double expectedWithdrawAmountOfSavingAccount = 4500;
		double expectedWithdrawAmountOfCurrentAccount = 5500;

		// Assert
		assertEquals(expectedWithdrawAmountOfSavingAccount, actualWithdrawAmountOfSavingAccount);
		assertEquals(expectedWithdrawAmountOfCurrentAccount, actualWithdrawAmountOfCurrentAccount);
	}

	public void test_depositOfSavingAndCurrentAccount() throws ParseException {
		// Arrange
		SavingAccount sa1 = new SavingAccount(1001, "prasad", 5000, "04/12/2020", "02/26/1998");
		CurrentAccount ca1 = new CurrentAccount(1022, "Ash", 6000, "04/07/2020", "04/20/1999");
		sa1.deposit(500);
		ca1.deposit(500);

		// Act
		double actualBalanceSavingAccount = sa1.getBalance();
		double actualBalanceOfCurrentAccount = ca1.getBalance();

		double expectedBalanceOfSavingAccount = 5500;
		double expectedBalanceOfCurrentAccount = 6500;

		// Assert
		assertEquals(expectedBalanceOfSavingAccount, actualBalanceSavingAccount);
		assertEquals(expectedBalanceOfCurrentAccount, actualBalanceOfCurrentAccount);
	}

	public void test_nameOfSavingAndCurrentAccount() throws ParseException {
		// Arrange
		SavingAccount sa1 = new SavingAccount(1001, "prasad", 5000, "04/12/2020", "02/26/1998");
		CurrentAccount ca1 = new CurrentAccount(1022, "Ash", 6000, "04/07/2020", "04/20/1999");

		// Act
		String actualNameSavingAccount = sa1.getName();
		String actualNameOfCurrentAccount = ca1.getName();

		String expectedNameOfSavingAccount = "prasad";
		String expectedNameOfCurrentAccount = "Ash";

		// Assert
		assertEquals(expectedNameOfSavingAccount, actualNameSavingAccount);
		assertEquals(expectedNameOfCurrentAccount, actualNameOfCurrentAccount);
	}

	public void test_accountNumberOfSavingAndCurrentAccount() throws ParseException {
		// Arrange
		SavingAccount sa1 = new SavingAccount(1001, "prasad", 5000, "04/12/2020", "02/26/1998");
		CurrentAccount ca1 = new CurrentAccount(1022, "Ash", 6000, "04/07/2020", "04/20/1999");

		// Act
		int actualAccNoSavingAccount = sa1.getAccno();
		int actualAccNoOfCurrentAccount = ca1.getAccno();

		int expectedAccNoOfSavingAccount = 1001;
		int expectedAccNoOfCurrentAccount = 1022;

		// Assert
		assertEquals(expectedAccNoOfSavingAccount, actualAccNoSavingAccount);
		assertEquals(expectedAccNoOfCurrentAccount, actualAccNoOfCurrentAccount);
	}

	public void test_ifAccountHolderIsCurrentOrSaving() throws ParseException {
		// Arrange
		SavingAccount sa1 = new SavingAccount(1001, "prasad", 5000, "04/12/2020", "02/26/1998");
		SavingAccount sa2 = new SavingAccount(1022, "Ash", 6000, "04/07/2020", "04/20/1999");
		CurrentAccount ca1 = new CurrentAccount(1022, "Ash", 6000, "04/07/2020", "04/20/1999");
		CurrentAccount ca2 = new CurrentAccount(1022, "Ash", 6000, "04/07/2020", "04/20/1999");

		// Act
		SavingAccount exceptedAccountClassOfSaving = sa2;
		SavingAccount actualAccountClasssOfSaving = sa1;
		CurrentAccount exceptedAccountClassOfCurrent = ca1;
		CurrentAccount actualAccountClasssOfCurrent = ca2;

		// Assert
		assertEquals(exceptedAccountClassOfSaving.getClass(), actualAccountClasssOfSaving.getClass());
		assertEquals(exceptedAccountClassOfCurrent.getClass(), actualAccountClasssOfCurrent.getClass());

	}

}
