package com.techlabs.model.test;

import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

import com.techlabs.model.*;

public class AccountTest {
	public static void main(String[] args) throws ParseException, IOException, NoSuchElementException {
		SavingAccount sa1 = new SavingAccount(1001, "prasad", 5000, "04/12/2020", "02/26/1998");
		SavingAccount sa2 = new SavingAccount(1002, "sarthak", 4000, "04/11/2020", "07/26/1978");
		SavingAccount sa3 = new SavingAccount(1003, "hemant", 5500, "04/18/2020", "10/26/1989");
		CurrentAccount ca1 = new CurrentAccount(1022, "Ash", 6000, "04/07/2020", "04/20/1999");
		CurrentAccount ca2 = new CurrentAccount(1012, "Sim", 5900, "04/20/2020", "08/20/2000");

		Account[] acc = { sa1, sa2, sa3, ca1, ca2 };

		printInfo(acc);
		findRichestAccountHolder(acc);
		findYoungestAccountHolder(acc, 30);
		writeAccountToFile(acc);
	}

	private static void findRichestAccountHolder(Account[] acc) {
		System.out.println("The Richest Account");
		int rich = 0;
		for (int i = 1; i < acc.length; i++) {
			if (acc[rich].getBalance() < acc[i].getBalance()) {
				rich = i;
			}
		}
		printInfo(acc[rich]);
	}

	private static void findYoungestAccountHolder(Account[] acc, int ageLimit) {
		System.out.println("The Youngest Account below " + ageLimit);
		int temp = 0;
		List young = new LinkedList();
		for (int i = 0; i < acc.length; i++) {
			if (ageLimit >= acc[i].getAge()) {
				young.add(acc[i]);
			}
		}
		printInfo(young);
	}

	private static void writeAccountToFile(Account[] acc) throws IOException {
		FileWriter fw = new FileWriter("Account.csv");
		fw.write("type,accno,name,balanmce,created_on,age\n");
		for (Account a : acc) {
			fw.write(a.getAccountType() + "," + a.getAccno() + "," + a.getName() + "," + a.getBalance() + ","
					+ a.getCreationDate() + "," + a.getAge() + "\n");
		}
		fw.close();
		System.out.println("File created");
	}

	private static void printInfo(List young) throws NoSuchElementException {
		for (Iterator i = young.iterator(); i.hasNext();) {
			if (i.next() != null) {
				Account acc = (Account) i.next();
				printInfo(acc);
			}
		}
	}

	private static void printInfo(Account[] acc) {
		for (int i = 0; i < acc.length; i++) {
			printInfo(acc[i]);
		}
	}

	private static void printInfo(Account acc) {
		System.out.println("Account Number:" + acc.getAccno());
		System.out.println("Account Name:" + acc.getName());
		System.out.println("Account Balance:" + acc.getBalance());
		System.out.println("Account Holder Age:" + acc.getAge());
		System.out.println();
	}
}
