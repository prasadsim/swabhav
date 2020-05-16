package com.techlabs.model.test;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;
import com.techlabs.model.*;

public class Test {

	public static void main(String[] args) throws ParseException, IOException {
		String file = "dataFile_emp.txt";
		String url = "https://swabhav-tech.firebaseapp.com/emp.txt";
		EmployeeDataAnalyzer analyzer = new EmployeeDataAnalyzer(new FileLoader(file));
		Collection<Employee> tree = analyzer.getEmployees();
		System.out.println("Total No. of Employee in Organization:" + tree.size());
		System.out.println("\nMaximum Salaried Employee Details!");
		System.out.println(analyzer.getRichEmp());
		System.out.println(analyzer.getDesignationwiseEmp());
		System.out.println(analyzer.getDeptWiseEmp());
	}
}