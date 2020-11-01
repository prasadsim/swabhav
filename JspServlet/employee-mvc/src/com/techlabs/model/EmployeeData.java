package com.techlabs.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EmployeeData {
	private static EmployeeData instance;
	public List<Employee> employees;

	private EmployeeData() {
		employees = new ArrayList<Employee>();
	}

	public static EmployeeData getInstance() {
		if (instance == null) {
			instance = new EmployeeData();
		}
		return instance;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void addEmployee(Employee emp) {
		employees.add(emp);
	}
}
