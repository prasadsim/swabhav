package com.techlabs.model;

public class Analyst extends Employee {
	public Analyst(String name, int id, GenderType gender, double salary) {
		super(name, id, gender, salary);
	}

	@Override
	public double calculateNetSalary() {

		double annualsalary = 0.4 * basicsalary + 0.3 * basicsalary;
		annualsalary = annualsalary * 12;
		return annualsalary;
	}
	
	double pa=0.4,bonus=0.3;
	@Override
	public String[] getSalaryDetails() {
		String[] allowances= {"PA is "+(pa*basicsalary),"Bonus is"+(bonus*basicsalary)};
		return allowances;
	}

}
