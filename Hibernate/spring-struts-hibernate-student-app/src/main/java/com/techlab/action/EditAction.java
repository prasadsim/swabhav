package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.Student;
import com.techlab.service.StudentService;
import com.techlab.viewmodel.EditVM;

public class EditAction extends ActionSupport implements ModelDriven<EditVM> {

	private EditVM student;
	private String studentId;
	@Autowired
	private StudentService service;

	public EditVM getStudent() {
		return student;
	}

	public void setStudent(EditVM student) {
		this.student = student;
	}

	public String doEdit() {
		service.updateStudent(studentId, student.getName(), student.getCgpa());
		return SUCCESS;
	}

	public String execute() {
		Student s = service.getStudentById(studentId);
		student.setName(s.getName());
		student.setCgpa(s.getCgpa());
		return SUCCESS;
	}

	@Override
	public void validate() {
		if (student.getName().equals("") || student.getName() == null) {
			addFieldError("name", "Enter Name");
		}
		if (student.getCgpa() == 0) {
			addFieldError("cgpa", "Enter cgpa");
		}
	}

	@Override
	public EditVM getModel() {
		student = new EditVM();
		return student;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}
