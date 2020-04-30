package com.techlabs.model;

import java.util.Date;
import java.text.ParseException;

public class Professor {
	Person person;
	private double basicSalary;

	public Professor(Person person, double basicSalary) throws ParseException {
		this.person=person;
		this.basicSalary = basicSalary;
	}

	public Person getPerson() {
		return person;
	}
	public double getBasicSalary() {
		return basicSalary;
	}

	public double getCalculatedSalary(int hours) {
		double grossSalary = this.basicSalary * hours;
		return grossSalary;
	}

}
