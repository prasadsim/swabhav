package com.techlabs.model;

public abstract class Employee {
	private String name;
	private int id;
	private GenderType gender;
	protected double basicsalary;

	public Employee(String name, int id, GenderType gender, double salary) {
		this.name = name;
		this.id = id;
		this.basicsalary = salary;
		this.gender=gender;
	}

	public abstract double calculateNetSalary();
	
	public abstract String[] getSalaryDetails();

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public GenderType getGender() {
		return gender;
	}

	public double getSalary() {
		return basicsalary;
	}
}
