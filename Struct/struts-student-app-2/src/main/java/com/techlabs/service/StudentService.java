package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.techlabs.model.Student;

public class StudentService {

	private List<Student> students = new ArrayList<Student>();
	private static StudentService instance;
	Student s1 = new Student(UUID.randomUUID().toString(), "prasad", 101, 22);
	Student s2 = new Student(UUID.randomUUID().toString(), "ash", 102, 23);
	Student s3 = new Student(UUID.randomUUID().toString(), "vinit", 103, 24);
	Student s4 = new Student(UUID.randomUUID().toString(), "pawan", 104, 22);

	private StudentService() {
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
	}

	public static StudentService getInstance() {
		if (instance == null) {
			instance = new StudentService();
		}
		return instance;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student s) {
		students.add(s);
	}

	public void deleteStudent(String id) {
		for (Student s : students) {
			if (s.getId().equals(id)) {
				students.remove(s);
			}
		}
	}

	public void updateStudent(Student updateStudent) {
		for (Student s : students) {
			if (s.getId().equals(updateStudent.getId())) {
				s.setName(updateStudent.getName());
				s.setAge(updateStudent.getAge());
				s.setRollno(updateStudent.getRollno());
			}
		}
	}

	public Student getStudentById(String id) {
		for (Student s : students) {
			if (s.getId().equals(id)) {
				return s;
			}
		}
		return null;
	}

}
