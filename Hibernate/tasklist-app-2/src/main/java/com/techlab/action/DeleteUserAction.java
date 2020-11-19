package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.service.UserService;

public class DeleteUserAction extends ActionSupport {

	@Autowired
	private UserService service;

	private int id;

	public String execute() {
		service.deleteUser(id);
		return SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
