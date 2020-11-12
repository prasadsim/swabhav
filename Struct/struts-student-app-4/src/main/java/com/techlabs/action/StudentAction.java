package com.techlabs.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

public class StudentAction extends ActionSupport {

	private List<Student> students;

	public String execute() {
		students = StudentService.getInstance().getStudents();
		return SUCCESS;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}