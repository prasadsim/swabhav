package com.techlabs.model.test;

import java.io.IOException;
import java.text.ParseException;
import com.techlabs.model.*;

public class Test {

	public static void main(String[] args) throws ParseException, IOException {
		String file = "dataFile_emp.txt";
		String url = "https://swabhav-tech.firebaseapp.com/emp.txt";
		EmployeeDataAnalyzer analyzer = new EmployeeDataAnalyzer(new UrlLoader(url));
		analyzer.addEmployee(new Employee(8001, "ASH", "SOFTWARE", 7782, "3-DEC-19", 1000, 0, 10));
		analyzer.addEmployee(new Employee(8012, "VINIT", "SOFTWARE", 7369, "3-JUL-20", 500, 0, 30));
		ConstructHierarchy construct = new ConstructHierarchy(analyzer);
		construct.design();
	}

}