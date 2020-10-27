package com.techlabs.model;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

public class EmployeeService {
	ArrayList<Employee> employees=new ArrayList<Employee>();
	
	public ArrayList<Employee> getEmployees() {
		employees.add(new Employee(UUID.randomUUID(),"prasad","sim"));
		employees.add(new Employee(UUID.randomUUID(),"vinit","nagap"));
		employees.add(new Employee(UUID.randomUUID(),"pawan","chabbria"));		
		return employees;		
	}

}
