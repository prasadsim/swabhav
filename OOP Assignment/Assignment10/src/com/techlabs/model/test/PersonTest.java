package com.techlabs.model.test;

import java.text.ParseException;

import com.techlabs.model.*;

public class PersonTest {
	public static void main(String[] args) throws ParseException {
		Student stu = new Student(new Person(1001, "Lower Parel", "26/02/1998"), Branch.CMPN);
		Professor pro = new Professor(new Person(15001, "Anderi", "04/05/1988"), 4500);

		printInfo(stu);
		printInfo(pro);
	}

	private static void printInfo(Student stu) {
		System.out.println(stu.getClass().getSimpleName());
		System.out.println("Id:" + stu.getPerson().getId());
		System.out.println("Address:" + stu.getPerson().getAddress());
		System.out.println("Date Of Birth:" + stu.getPerson().getDob());
		System.out.println("Branch:" + stu.getBranch());
		System.out.println();
	}

	private static void printInfo(Professor pro) {
		System.out.println(pro.getClass().getSimpleName());
		System.out.println("Id:" + pro.getPerson().getId());
		System.out.println("Address:" + pro.getPerson().getAddress());
		System.out.println("Date Of Birth:" + pro.getPerson().getDob());
		System.out.println("Basic Salary of One Hour:" + pro.getBasicSalary());
		System.out.println("Calculated Salary:" + pro.getCalculatedSalary(5));
		System.out.println();
	}

}
