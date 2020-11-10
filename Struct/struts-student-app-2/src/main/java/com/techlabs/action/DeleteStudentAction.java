package com.techlabs.action;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.StudentService;

public class DeleteStudentAction extends ActionSupport {

	private String deleteStudent;

	public String execute() {
		System.out.println("delete" + deleteStudent);
		StudentService.getInstance().deleteStudent(deleteStudent);
		return SUCCESS;
	}

	public String getDeleteStudent() {
		return deleteStudent;
	}

	public void setDeleteStudent(String deleteStudent) {
		this.deleteStudent = deleteStudent;
	}
}
