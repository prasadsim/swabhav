package com.techlabs.model;

public class ConstructHierarchy {
	private EmployeeDataAnalyzer analyzer;

	public ConstructHierarchy(EmployeeDataAnalyzer analyzer) {
		this.analyzer = analyzer;
	}

	public void design() {
		for (Employee employee : this.analyzer.getEmployees()) {
			for (Employee employee1 : analyzer.getEmployees()) {
				if (employee.getEid() == employee1.getManagerId()) {
					employee.addReporters(employee1);
				}
			}
		}

		for (Employee employee : this.analyzer.getEmployees()) {
			if (employee.getManagerId() == 0) {
				System.out.print(employee.getEname() + " (" + employee.getRole() + ")\n");
				displayReporters(employee, 0);
			}
		}
	}

	private void displayReporters(Employee emp, int level) {
		String branch = "";
		level++;
		for (Employee employee : emp.getReporters()) {
			System.out.print(branch + separator(level) + "|->" + employee.getEname() + " (" + employee.getRole() + ")\n");
			displayReporters(employee, level);
		}
	}

	private String separator(int level) {
		String space = "";
		for (int i = 0; i < level; i++) {
			space = space + "    ";
		}
		return space;
	}
}
