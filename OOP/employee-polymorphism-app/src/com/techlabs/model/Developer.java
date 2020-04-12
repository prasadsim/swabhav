package com.techlabs.model;

public class Developer extends Employee {
	public Developer(String name, int id, GenderType gender, double salary) {
		super(name, id, gender, salary);
	}

	@Override
	public double calculateNetSalary() {
		double annualsalary = 0.3 * basicsalary;
		annualsalary = annualsalary * 12;
		return annualsalary;
	}
	
	double perks=0.3;

	@Override
	public String[] getSalaryDetails() {
		String[] allowances = { "Perks is " + (perks * basicsalary)};
		return allowances;
	}

}
