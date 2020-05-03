package com.techlabs.model;

import java.net.*;
import java.text.ParseException;
import java.util.TreeSet;
import java.io.*;

public class GetFromUrl {

	TreeSet<String> list = new TreeSet();
	TreeSet<Employee> employees = new TreeSet<Employee>(new SalaryComparator());

	public void getUrlContents(String theUrl) throws ParseException, IOException {

		URL url = new URL(theUrl);
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String line;
		while ((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();
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

	public TreeSet<Employee> getEmployees() {
		return employees;
	}
}