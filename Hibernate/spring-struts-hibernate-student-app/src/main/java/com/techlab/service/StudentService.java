package com.techlab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.entity.Student;
import com.techlab.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repo;

	public void addStudent(Student s) {
		repo.addStudent(s);
	}

	public void updateStudent(String id, String name, double cgpa) {
		repo.updateStudent(id, name, cgpa);
	}

	public void deleteStudent(String id) {
		repo.deleteStudent(id);
	}

	public Student getStudentById(String id) {
		return repo.getStudentById(id);
	}

	public List<Student> getStudents() {
		return repo.getStudents();
	}
}
