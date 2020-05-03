package com.techlabs.model.test;

import java.text.ParseException;
import java.util.TreeSet;

import com.techlabs.model.DataBaseManager;
import com.techlabs.model.Employee;

public class DataBaseTest {
	public static void main(String[] args) throws ParseException {
		DataBaseManager dbManager = new DataBaseManager();
		dbManager.init();
		TreeSet<Employee> employees = dbManager.getEmployees();
		for (Employee employee : employees) {
			printInfo(employee);
		}
	}

	private static void printInfo(Employee employee) {
		System.out.print("ename:" + employee.geteName());
		System.out.println(" salary:" + employee.getSalary());
	}
}