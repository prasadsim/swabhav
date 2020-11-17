package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.service.StudentService;

public class DeleteAction extends ActionSupport {

	private String studentId;
	@Autowired
	private StudentService service;

	public String execute() {
		service.deleteStudent(studentId);
		return SUCCESS;
	}

	public String getDeleteStudent() {
		return studentId;
	}

	public void setDeleteStudent(String deleteStudent) {
		this.studentId = deleteStudent;
	}
}
