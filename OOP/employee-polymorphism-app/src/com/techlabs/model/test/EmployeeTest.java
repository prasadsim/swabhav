package com.techlabs.model.test;

import com.techlabs.model.*;
import com.techlabs.model.GenderType;

public class EmployeeTest {
	public static void main(String[] args) {

		Manager m1 = new Manager("Ash", 1001, GenderType.MALE, 100000);
		Developer d1 = new Developer("Sim", 1005, GenderType.MALE, 50000);
		Analyst a1 = new Analyst("Sneha", 1007, GenderType.FEMALE, 75000);

		printSalarySlip(m1);
		printSalarySlip(d1);
		printSalarySlip(a1);
	}

	private static void printSalarySlip(Employee e) {
		System.out.println("Employee Post:" + e.getClass().getSimpleName());
		System.out.println("Employee Name:" + e.getName());
		System.out.println("Employee Id:" + e.getId());
		System.out.println("Employee Gender:" + e.getGender());
		System.out.println("Employee Basic Salary:" + e.getSalary());
		System.out.println("Employee netsalary:" + e.calculateNetSalary());
		for (String s : e.getSalaryDetails()) {
			System.out.println(s);
		}
		System.out.println();
	}
}
