package com.techlabs.model;

public class ConstructHierarchy {
	private EmployeeDataAnalyzer analyzer;

	public ConstructHierarchy(EmployeeDataAnalyzer analyzer) {
		this.analyzer = analyzer;
	}

	public void design() {
		Employee presidentEmp = null;
		for (Employee employee : this.analyzer.getEmployees()) {
			for (Employee employee1 : analyzer.getEmployees()) {
				if (employee.getEid() == employee1.getManagerId()) {
					employee.addReporters(employee1);
				}
			}
			if (employee.getManagerId() == 0) {
				presidentEmp = employee;
			}
		}

		System.out.print(presidentEmp.getEname() + " (" + presidentEmp.getRole() + ")\n");
		displayReporters(presidentEmp, presidentEmp.getManagerId());
	}

	private void displayReporters(Employee emp, int level) {
		level++;
		for (Employee employee : emp.getReporters()) {
			System.out.print(separator(level) + "|->" + employee.getEname() + " (" + employee.getRole() + ")\n");
			displayReporters(employee, level);
		}
	}

	private String separator(int level) {
		String space = "";
		for (int i = 0; i < level; i++) {
			space = space + "     ";
		}
		return space;
	}
}
