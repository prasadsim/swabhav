package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.techlabs.model.Student;

@Repository
public class StudentRepository {

	private List<Student> students = null;
	private static StudentRepository instance = null;

	private StudentRepository() {
		System.out.println("inside repo");
		students = new ArrayList();
		students.add(new Student(UUID.randomUUID().toString(), "prasad", 101, 22));
		students.add(new Student(UUID.randomUUID().toString(), "ash", 102, 21));
	}

	public static StudentRepository getInstance() {
		if (instance == null) {
			instance = new StudentRepository();
		}
		return instance;
	}

	public void addStudent(Student s) {
		students.add(s);
	}

	public List<Student> getStudents() {
		return students;
	}

	public void deleteStudent(String id) {
		for (Student s : students) {
			if (s.getId().equals(id)) {
				students.remove(s);
				break;
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
