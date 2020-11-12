package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Student;
import com.techlabs.repository.StudentRepository;

@Service("studentsvcc")
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	public StudentService() {
		System.out.println("service has been invoked");
	}
	
	public List<Student> getStudents(){
		return repository.get();
	}

}