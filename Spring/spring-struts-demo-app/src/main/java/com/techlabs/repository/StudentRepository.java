package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlabs.model.Student;

@Repository
public class StudentRepository {
private List<Student> students;

	public StudentRepository() {
		System.out.println("Student repository has been called");
		Student s1= new Student();
		Student s2= new Student();
		students= new ArrayList<Student>();
		s1.setName("sss");
		s1.setRollno(1);
		s2.setName("abc");
		s2.setRollno(2);
		students.add(s1);
		students.add(s2);
	}
	public List<Student> get(){
		return students;
	}
}