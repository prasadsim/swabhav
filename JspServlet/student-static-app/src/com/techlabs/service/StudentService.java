package com.techlabs.service;

import java.util.*;

import com.techlabs.model.Student;

public class StudentService {

	private static List<Student> students = new ArrayList();

	public StudentService() {
		System.out.println("inside student service");
	}
	
	public void addStudent(Student s) {
		students.add(s);
	}

	public List getStudents() {
		return students;
	}

	public void deleteStudent(String id) {
		for (Student s : students) {
			if (s.getId().equals(id)) {
				students.remove(s);
			}
		}
	}
}
