package com.techlabs.model;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

public class EmployeeService {
	ArrayList<Employee> employees=new ArrayList<Employee>();
	
	public ArrayList<Employee> getEmployees() {
		employees.add(new Employee(1,"prasad","sim"));
		employees.add(new Employee(2,"vinit","nagap"));
		employees.add(new Employee(3,"pawan","chabbria"));		
		return employees;		
	}

}
