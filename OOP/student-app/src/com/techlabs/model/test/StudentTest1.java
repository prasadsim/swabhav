package com.techlabs.model.test;

import com.techlabs.model.Student;

public class StudentTest1 {

	public static void main(String[] args) {
		Student s1 = new Student(101, "abc");
		System.out.println("Count:" + s1.getStudentCount() + "\n");

		Student s2 = new Student(102, "xyz");
		System.out.println("Count:" + s1.getStudentCount() + "\n");

		Student s3 = new Student(103, "lmno", 8.0f);
		System.out.println("Count:" + s1.getStudentCount() + "\n");
	}
}

//due to object is created, constructor is invoke and count gets incremented;
