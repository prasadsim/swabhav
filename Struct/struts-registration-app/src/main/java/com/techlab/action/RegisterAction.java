package com.techlab.action;

import com.opensymphony.xwork2.Action;

public class RegisterAction implements Action {

	private String name, message;
	private String phone;

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("name is " + name);
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		System.out.println("phone is " + phone);
		this.phone = phone;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
