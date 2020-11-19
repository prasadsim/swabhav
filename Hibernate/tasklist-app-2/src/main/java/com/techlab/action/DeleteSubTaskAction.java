package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.service.SubTaskService;

public class DeleteSubTaskAction extends ActionSupport{
	
	@Autowired
	private SubTaskService service;
	
	private int id;
	
	public String execute() {
		service.deleteSubTask(id);
		return SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
