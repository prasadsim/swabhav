package com.techlabs.model;

import java.text.ParseException;
import java.util.*;
import java.io.*;

public class EmployeeDataAnalyzer {
	private TreeSet<Employee> employees = new TreeSet<Employee>();

	public EmployeeDataAnalyzer(ILoader load) throws ParseException {
		Set<String> list = load.getData();
		for (String str : list) {
			String[] elements = str.split(",");
			int empId = Integer.parseInt(elements[0]);
			String eName = elements[1].replaceAll("'", "");
			String role = elements[2].replaceAll("'", "");
			int managerId = 0;
			if (!elements[3].equals("NULL")) {
				managerId = Integer.parseInt(elements[3]);
			}
			String doj = elements[4].replaceAll("'", "");
			int salary = Integer.parseInt(elements[5]);
			int comm = 0;
			if (!elements[6].equals("NULL")) {
				comm = Integer.parseInt(elements[6]);
			}
			int deptId = Integer.parseInt(elements[7]);
			employees.add(new Employee(empId, eName, role, managerId, doj, salary, comm, deptId));
		}
	}

	public Map<String, Integer> getDesignationwiseEmp() {
		System.out.println("\nTotal Count According to Designation!");
		Map<String, Integer> designationWiseEmp = new TreeMap();
		int count = 0;
		for (Employee employee : employees) {
			if (designationWiseEmp.containsKey(employee.getRole())) {
				count = designationWiseEmp.get(employee.getRole());
				count++;
				designationWiseEmp.put(employee.getRole(), count);
			} else {
				count = 1;
				designationWiseEmp.put(employee.getRole(), count);
			}
		}
		return designationWiseEmp;
	}

	public Map<Integer, Integer> getDeptWiseEmp() {
		System.out.println("\nTotal Count According to DeptNo!");
		Map<Integer, Integer> deptWiseEmp = new TreeMap();
		int count = 0;
		for (Employee e : employees) {
			if (deptWiseEmp.containsKey(e.getDeptno())) {
				count = deptWiseEmp.get(e.getDeptno());
				count++;
				deptWiseEmp.put(e.getDeptno(), count);
			} else {
				count = 1;
				deptWiseEmp.put(e.getDeptno(), count);
			}
		}
		return deptWiseEmp;
	}

	public Employee getRichEmp() {
		Employee richEmp = employees.first();
		for (Employee employee : employees) {
			if (richEmp.getSalary() < employee.getSalary()) {
				richEmp = employee;
			}
		}
		return richEmp;
	}

	public Collection<Employee> getEmployees() {
		return employees;
	}

}