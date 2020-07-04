package com.techlabs.model.test;

import java.io.IOException;
import java.text.ParseException;
import com.techlabs.model.*;

public class Test {

	public static void main(String[] args) throws ParseException, IOException {
		String file = "dataFile_emp.txt";
		String url = "https://swabhav-tech.firebaseapp.com/emp.txt";
		EmployeeDataAnalyzer analyzer = new EmployeeDataAnalyzer(new UrlLoader(url));
		ConstructHierarchy construct = new ConstructHierarchy(analyzer);
		construct.design();
	}

}