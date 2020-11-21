package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.User;
import com.techlab.service.UserService;
import com.techlab.viewmodel.AddUserVm;

public class AddUserAction extends ActionSupport implements ModelDriven<AddUserVm> {

	@Autowired
	private UserService service;
	private AddUserVm user;
	private String msg;
	private String confirmPassword;

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String execute() {
		return SUCCESS;
	}

	public String doAdd() {
		if (user.getFirstname() == "") {
			msg = "Enter Firstname";
			return INPUT;
		}
		if (user.getLastname() == "") {
			msg = "Enter Lastname";
			return INPUT;
		}
		if (user.getEmail() == "") {
			msg = "Enter Email";
			return INPUT;
		}
		if (user.getUsername() == "") {
			msg = "Enter Username";
			return INPUT;
		}
		if (user.getPassword() == "") {
			msg = "Enter password";
			return INPUT;
		}
		if (!user.getPassword().equals(confirmPassword)) {
			msg = "Enter confirm password correctly";
			return INPUT;
		}
		for (User u : service.getUsers()) {
			if (u.getEmail().equals(user.getEmail())) {
				msg = "This Email Id is already present!!!";
				return INPUT;
			}
			if (u.getUsername().equals(user.getUsername())) {
				msg = "This Username is already present!!!";
				return INPUT;
			}
		}
		service.addUser(user.getFirstname(), user.getLastname(), user.getEmail(), user.getUsername(),
				user.getPassword());
		return SUCCESS;
	}

	public AddUserVm getUser() {
		return user;
	}

	public void setUser(AddUserVm user) {
		this.user = user;
	}

	@Override
	public AddUserVm getModel() {
		user = new AddUserVm();
		return user;
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
