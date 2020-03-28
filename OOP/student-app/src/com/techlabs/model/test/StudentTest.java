package com.techlabs.model.test;

import com.techlabs.model.Student;;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student(101, "abc");
		System.out.println("Count:" + s1.getStudentCount() + "\n");

		Student s2 = new Student(102, "xyz");
		System.out.println("Count:" + s2.getStudentCount() + "\n");

		Student s3 = new Student(103, "lmno", 8.0f);
		System.out.println("Count:" + s3.getStudentCount() + "\n");
//		printInfo(s1);4
//
//		printInfo(s2);
//
//		printInfo(s3);

//	}
//
//	private static void printInfo(Student s) {
//		System.out.println("Student Id:" + s.getId());
//		System.out.println("Student Name:" + s.getName());
//		System.out.println("Student Cgpa:" + s.getCgpa());
	}

}
