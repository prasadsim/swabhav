package com.techlab.action;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.Student;
import com.techlab.service.StudentService;
import com.techlab.viewmodel.AddVM;

public class AddAction extends ActionSupport implements ModelDriven<AddVM> {

	private AddVM student;

	public AddVM getStudent() {
		return student;
	}

	public void setStudent(AddVM student) {
		this.student = student;
	}

	@Autowired
	private StudentService service;

	@Override
	public void validate() {
		if (student.getName().equals("") || student.getName() == null) {
			addFieldError("name", "Enter Name");
		}
		if (student.getCgpa() == 0) {
			addFieldError("cgpa", "Enter cgpa");
		}
	}

	public String doAdd() {
		Student s = new Student();
		s.setId(UUID.randomUUID().toString());
		s.setName(student.getName());
		s.setCgpa(student.getCgpa());
		service.addStudent(s);
		return SUCCESS;
	}

	public String execute() {
		return SUCCESS;
	}

	@Override
	public AddVM getModel() {
		student = new AddVM();
		return student;
	}

}
