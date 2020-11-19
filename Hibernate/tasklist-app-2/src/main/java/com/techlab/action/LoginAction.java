package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.User;
import com.techlab.service.UserService;
import com.techlab.viewmodel.UserVm;

public class LoginAction extends ActionSupport implements ModelDriven<UserVm> {
	@Autowired
	private UserService service;
	private UserVm user;
	private String msg;

	public UserVm getUser() {
		return user;
	}

	public void setUser(UserVm user) {
		this.user = user;
	}

	@Override
	public UserVm getModel() {
		user = new UserVm();
		return user;
	}

	public String execute() {
		return SUCCESS;
	}

	public String doLogin() {
		if (user.getUser() == "") {
			msg = "Enter Username";
			return INPUT;
		}
		if (user.getPass() == "") {
			msg = "Enter password";
			return INPUT;
		}
		for (User u : service.getUsers()) {
			if (u.getUsername().equals(user.getUser()) && u.getPassword().equals(user.getPass())) {
				return SUCCESS;
			}
		}
		return INPUT;

	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

}
