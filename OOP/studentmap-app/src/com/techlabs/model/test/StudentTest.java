package com.techlabs.model.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.techlabs.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student(1, 10, "Ash", 8.5);
		Student s2 = new Student(1, 10, "Sim", 8.55);
		Student s3 = new Student(10, 1, "Sim", 8.55);

		Map<Student, Student> map = new HashMap<Student,Student>();
		map.put(s1, s1);
		map.put(s2, s2);
		map.put(s3, s3);
		System.out.println(map.size());
	}

}
