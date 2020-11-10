package com.techlabs.action;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.LoginService;

public class LoginAction extends ActionSupport {
	private String username, password, message;

	@Override
	public void validate() {
		if (username.equals("")) {
			addFieldError("username", "Enter Username");
		}
		if (password.equals("")) {
			addFieldError("password", "Enter Password");
		}
	}

	@Override
	public String execute() throws Exception {
		System.out.println("Inside Execute");
		LoginService service = new LoginService();
		if (service.isValidate(username, password)) {
			return "success";
		}
		return "error";
	}

	public String getUsername() {
		return username;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}