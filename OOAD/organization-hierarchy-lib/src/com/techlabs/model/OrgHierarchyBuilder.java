package com.techlabs.model;

import java.util.Collection;
import java.util.TreeSet;

public class OrgHierarchyBuilder {
	private TreeSet<Employee> listEmp;
	private Employee ceoEmp = null;
	private String showStr = "";
	private String showXmlStr = "";

	public OrgHierarchyBuilder(Collection listEmp) {
		this.listEmp = (TreeSet) listEmp;
		for (Employee employee : this.listEmp) {
			for (Employee employee1 : this.listEmp) {
				if (employee.getEid() == employee1.getManagerId()) {
					employee.addReporters(employee1);
				}
			}
			if (employee.getManagerId() == 0) {
				this.ceoEmp = employee;
			}
		}
	}

	public String show() {
		String str = ceoEmp.getEname() + " (" + ceoEmp.getRole() + ")\n";
		str = str + this.getReporters(ceoEmp, ceoEmp.getManagerId());
		return str;
	}

	public String showXml() {
		String str = "<" + ceoEmp.getEname() + ">\n";
		str = str + this.getReportersXml(ceoEmp, ceoEmp.getManagerId());
		str = str + "</" + ceoEmp.getEname() + ">";
		return str;
	}

	private String getReportersXml(Employee emp, int level) {
		level++;
		for (Employee employee : emp.getReporters()) {
			showXmlStr = showXmlStr + separator(level) + "<" + employee.getEname() + ">" + "\n";
			getReportersXml(employee, level);
			showXmlStr = showXmlStr + separator(level) + "</" + employee.getEname() + ">" + "\n";
		}

		return showXmlStr;
	}

	private String getReporters(Employee emp, int level) {
		level++;
		for (Employee employee : emp.getReporters()) {
			showStr = showStr + separator(level) + "|->" + employee.getEname() + " (" + employee.getRole() + ")\n";
			getReporters(employee, level);
		}
		return showStr;
	}

	private String separator(int level) {
		String space = "";
		for (int i = 0; i < level; i++) {
			space = space + "     ";
		}
		return space;
	}

	public Employee getCeo() {
		return ceoEmp;
	}
}
