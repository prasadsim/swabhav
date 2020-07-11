package com.techlabs.model.test;

import java.io.IOException;
import java.text.ParseException;

import com.techlabs.model.EmployeeDataAnalyzer;
import com.techlabs.model.FileLoader;
import com.techlabs.model.OrgHierarchyBuilder;

public class Test {

	public static void main(String[] args) throws ParseException, IOException {
		String file = "dataFile_emp.txt";
		String url = "https://swabhav-tech.firebaseapp.com/emp.txt";
		EmployeeDataAnalyzer analyzer = new EmployeeDataAnalyzer(new FileLoader(file));
		OrgHierarchyBuilder builder = new OrgHierarchyBuilder(analyzer.getEmployees());
		System.out.println(builder.show());
		System.out.println(builder.showXml());
	}
}
