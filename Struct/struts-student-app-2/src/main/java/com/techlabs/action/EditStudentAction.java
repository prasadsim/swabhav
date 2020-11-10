package com.techlabs.action;

import java.util.UUID;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

public class EditStudentAction extends ActionSupport implements ModelDriven<Student> {

	private Student student;

	public String execute() {
		student.setId(UUID.randomUUID());
		System.out.println("success " + student.getId() + "  " + student.getName());
		StudentService.getInstance().addStudent(student);
		return SUCCESS;
	}

	
	public String doEdit() {
		System.out.println("doAdd " + student.getId() + "  " + student.getName());
		return INPUT;
	}

	@Override
	public Student getModel() {
		student = new Student();
		return student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
