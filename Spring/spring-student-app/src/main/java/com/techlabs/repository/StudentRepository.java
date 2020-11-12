package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.techlabs.model.Student;

public class StudentRepository {

	private List<Student> students = null;

	public StudentRepository() {
		students = new ArrayList();
		students.add(new Student(UUID.randomUUID().toString(), "prasad", 101, 22));
		students.add(new Student(UUID.randomUUID().toString(), "ash", 102, 21));
	}
}
