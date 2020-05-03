package com.techlabs.model;

import java.util.Date;
import java.text.ParseException;

public class Professor extends Person implements SalariedEmployee {
	Person person;
	private double basicSalary;

	public Professor(int id, String address, String dob, double basicSalary) throws ParseException {
		super(id, address, dob);
		this.basicSalary = basicSalary;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	@Override
	public double getNetSalary(int hours) {
		double grossSalary = this.basicSalary * hours;
		return grossSalary;
	}

}
