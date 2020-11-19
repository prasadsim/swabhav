package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.service.TaskService;

public class DeleteTaskAction extends ActionSupport{
	
	@Autowired
	private TaskService service;
	
	private int id;
	
	public String execute() {
		service.deleteTask(id);
		return SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
