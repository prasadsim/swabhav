package com.techlabs.model.test;

import java.io.IOException;
import java.text.ParseException;
import java.util.TreeSet;
import com.techlabs.model.*;

public class Test {

	public static void main(String[] args) throws ParseException, IOException {
		GetFromUrl u = new GetFromUrl();
		u.getUrlContents("https://swabhav-tech.firebaseapp.com/emp.txt");
		TreeSet<Employee> tree = (TreeSet<Employee>) u.getEmployees();
		for (Employee employee : tree) {
			System.out.println("Id:" + employee.getEid() + "\tSalary:" + employee.getSalary());
		}
	}
}
