package com.techlabs.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public abstract class Account {
	private Date creationDate;
	private Date dateOfBirth;
	private int accno;
	private String name;
	protected double balance;
	SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");

	public Account(int accno, String name, double balance, String creationDate, String dateOfBirth)
			throws ParseException {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		this.creationDate = sdf.parse(creationDate);
		this.dateOfBirth = sdf.parse(dateOfBirth);
	}

	public void deposit(int amt) {
		this.balance = this.balance + amt;
	}

	public abstract void withdraw(int amt);

	public abstract String getAccountType();

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public int getAge() {
		int age = 0;
		Calendar c = Calendar.getInstance();
		c.setTime(dateOfBirth);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		LocalDate dob = LocalDate.of(year, month, date);
		LocalDate today = LocalDate.now();
		Period diff1 = Period.between(dob, today);
		age = diff1.getYears();
		return age;
	}
}
