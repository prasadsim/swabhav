package com.techlabs.action;

import java.util.UUID;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;
import com.techlabs.viewModel.EditStudentVM;

public class EditStudentAction extends ActionSupport implements ModelDriven<EditStudentVM> {

	private String editStudent;
	private Student editStudentObject;
	private Student s;
	private EditStudentVM editStudentVm;

	@Override
	public EditStudentVM getModel() {
		editStudentVm = new EditStudentVM();
		return editStudentVm;
	}

	public String execute() {
		this.editStudentObject = StudentService.getInstance().getStudentById(editStudent);
		editStudentVm = new EditStudentVM();
		editStudentVm.setAge(editStudentObject.getAge());
		editStudentVm.setName(editStudentObject.getName());
		editStudentVm.setRollno(editStudentObject.getRollno());
		return SUCCESS;
	}

	public String doEdit() {
		this.editStudentObject.setAge(editStudentVm.getAge());
		editStudentObject.setName(editStudentVm.getName());
		editStudentObject.setRollno(editStudentVm.getRollno());
		StudentService.getInstance().updateStudent(editStudentObject);
		return "success";
	}

	public String getEditStudent() {
		return editStudent;
	}

	public void setEditStudent(String editStudent) {
		this.editStudent = editStudent;
	}

	public Student getEditStudentObject() {
		return editStudentObject;
	}

	public void setEditStudentObject(Student editStudentObject) {
		this.editStudentObject = editStudentObject;
	}

	public EditStudentVM getEditStudentVm() {
		return editStudentVm;
	}

	public void setEditStudentVm(EditStudentVM editStudentVm) {
		this.editStudentVm = editStudentVm;
	}

}
