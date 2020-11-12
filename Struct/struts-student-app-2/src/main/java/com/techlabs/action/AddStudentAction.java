package com.techlabs.action;

import java.util.UUID;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;
import com.techlabs.viewModel.AddStudentVM;

public class AddStudentAction extends ActionSupport implements ModelDriven<AddStudentVM> {

	private Student student;
	private AddStudentVM studentVm;

	public AddStudentVM getStudentVm() {
		return studentVm;
	}

	public void setStudentVm(AddStudentVM studentVm) {
		this.studentVm = studentVm;
	}

	public String execute() {
		return SUCCESS;
	}

	public void validate() {
		if ("".equals(studentVm.getName())) {
			addFieldError("name", "Enter Name");
		}
		if (studentVm.getAge() == 0) {
			addFieldError("age", "Enter age");
		}
		if (studentVm.getAge() == 0) {
			addFieldError("rollno", "Enter RollNo");
		}
	}

	public String doAdd() {
		student = new Student(UUID.randomUUID().toString(), studentVm.getName(), studentVm.getRollno(),
				studentVm.getAge());
		StudentService.getInstance().addStudent(student);
		return SUCCESS;
	}

	@Override
	public AddStudentVM getModel() {
		studentVm = new AddStudentVM();
		return studentVm;
	}

}
