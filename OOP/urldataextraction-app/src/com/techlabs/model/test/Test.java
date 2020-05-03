package com.techlabs.model.test;

import java.io.IOException;
import java.text.ParseException;
import java.util.TreeSet;
import com.techlabs.model.*;

public class Test {

	public static void main(String[] args) throws ParseException, IOException {
		GetFromUrl u = new GetFromUrl();
		u.getUrlContents("https://swabhav-tech.firebaseapp.com/emp.txt");
		TreeSet<Employee> emp = u.getEmployees();
		for(Employee t:emp) {
			System.out.println("Id:"+t.getEid()+"\tSalary:"+t.getSalary());
		}
	}
}
