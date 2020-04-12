package com.techlabs.model.test;
import com.techlabs.model.*;
public class AccountTest {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount(1001,"Ash",5000);
		CurrentAccount ca = new CurrentAccount(1002,"Sim",000);
		
		printInfo(sa);
		printInfo(ca);
		
		sa.deposit(500);
		ca.withdraw(4d000);
		printInfo(sa);
		printInfo(ca);
	}
	
	private static void printInfo(Account acc) {
		System.out.println("Account Number:"+acc.getAccno());
		System.out.println("Account Name:"+acc.getName());
		System.out.println("Account Balance:"+acc.getBalance());
		System.out.println();
	}
}
