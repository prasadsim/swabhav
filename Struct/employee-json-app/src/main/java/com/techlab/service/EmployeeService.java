package com.techlab.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.techlab.model.Employee;

public class EmployeeService {
	private static EmployeeService instance;
	public List<Employee> employees;
	Employee emp1 = new Employee(UUID.randomUUID().toString(), "prasad", "developer");
	Employee emp2 = new Employee(UUID.randomUUID().toString(), "vinit", "designer");
	Employee emp3 = new Employee(UUID.randomUUID().toString(), "pawan", "analyst");

	private EmployeeService() {
		employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
	}

	public static EmployeeService getInstance() {
		if (instance == null) {
			instance = new EmployeeService();
		}
		return instance;
	}

	public List<Employee> getEmployees() {
		return employees;

	}

}