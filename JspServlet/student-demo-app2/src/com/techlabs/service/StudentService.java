package com.techlabs.service;

import java.util.*;

import com.techlabs.model.Student;

public class StudentService {

	private static StudentService instance;
	private List<Student> students = new ArrayList();

	private StudentService() {
		System.out.println("inside student service");
	}
	public static StudentService getInstance() {
		if (instance == null) {
			instance = new StudentService();
		}
		return instance;
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
