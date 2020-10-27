package com.techlabs.model;

import java.util.List;
import java.util.ArrayList;

public class EmployeeInsert {
	List<Employee> employees = new ArrayList<Employee>();

	public void addEmployee(Employee emp) {
		employees.add(emp);
	}

	public List<Employee> getEmployee() {
		return employees;
	}

}
