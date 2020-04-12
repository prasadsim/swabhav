package com.techlabs.model;

public class Manager extends Employee {
	public Manager(String name, int id, GenderType gender, double salary) {
		super(name, id, gender, salary);
	}

	@Override
	public double calculateNetSalary() {
		double annualsalary=0.5 * basicsalary+0.4 * basicsalary+0.3 * basicsalary;
		annualsalary = annualsalary * 12;
		return annualsalary;
	}
	double hra=0.5,ta=0.4,da=0.3;
	@Override
	public String[] getSalaryDetails() {
		String[] allowances= {"HRA is "+(hra*basicsalary),"TA is "+(ta*basicsalary),"DA is "+(da*basicsalary)};
		return allowances;
	}
}
