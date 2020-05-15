package com.techlabs.model.test;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Collection;
import java.util.TreeSet;
import com.techlabs.model.*;

public class Test {

	public static void main(String[] args) throws ParseException, IOException {
		DataExtract u = new DataExtract();
		u.getDataFromSource("https://swabhav-tech.firebaseapp.com/emp.txt", "dataFile_emp.txt");
		Collection<Employee> tree = u.getEmployees();
		Employee richEmp = null;

		for (Employee employee : tree) {
			richEmp = employee;
			System.out.println(employee);
		}
		for (Employee e : tree) {
			if (richEmp.getSalary() < e.getSalary()) {
				richEmp = e;
			}
		}
		System.out.println("\nTotal No. of Employee in Organization:" + tree.size());
		System.out.println("\nMaximum Salaried Employee Details!");
		System.out.println(richEmp);
		String m = "manager", c = "Clerk", p = "president", s = "salesman", a = "Analyst";
		int mc = 0, cc = 0, pc = 0, sc = 0, ac = 0, dept10 = 10, dept20 = 20, dept30 = 30, dept10Count = 0, dept20Count = 0, dept30Count = 0;
		for (Employee e : tree) {
			if (m.equalsIgnoreCase(e.getRole())) {
				mc++;
			}
			if (c.equalsIgnoreCase(e.getRole())) {
				cc++;
			}
			if (p.equalsIgnoreCase(e.getRole())) {
				pc++;
			}
			if (s.equalsIgnoreCase(e.getRole())) {
				sc++;
			}
			if (a.equalsIgnoreCase(e.getRole())) {
				ac++;
			}
			if (dept10 == e.getDeptno()) {
				dept10Count++;
			}
			if (dept20 == e.getDeptno()) {
				dept20Count++;
			}
			if (dept30 == e.getDeptno()) {
				dept30Count++;
			}
		}
		System.out.println("\nTotalCount\nManager:" + mc + "\nClerk:" + cc + "\nPresident:" + pc + "\nSalesman:" + sc
				+ "\nAnalyst:" + ac);
		System.out.println("\nTotalCountOnDeptNo\nDeptNo:10 has " + dept10Count + "\nDeptNo:20 has " + dept20Count + "\nDeptNo:30 has " + dept30Count);
//		writeIntoCsv(tree);
	}

	private static void writeIntoCsv(Collection<Employee> tree) throws IOException {
		FileWriter fw = new FileWriter("Employee.csv");
		fw.write(
				" Employee_id,Employee_name,Employee_designation,Manager_id,Date_of_joining,Salary,Commission,Departmentnumber\n");
		for (Employee e : tree) {
			fw.write(e.getEid() + "," + e.getEname() + "," + e.getRole() + "," + e.getManagerId() + "," + e.getDoj()
					+ "," + e.getSalary() + "," + e.getComm() + "," + e.getDeptno() + "\n");
		}
		fw.close();
		System.out.println("\nFile created");
	}
}
