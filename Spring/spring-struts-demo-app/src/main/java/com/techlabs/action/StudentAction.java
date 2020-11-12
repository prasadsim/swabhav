package com.techlabs.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.service.StudentService;

public class StudentAction implements Action {
	@Autowired
	private StudentService studentService;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Action is getting executed");
		System.out.println(studentService.getStudents().size());
		return "none";
	}

}