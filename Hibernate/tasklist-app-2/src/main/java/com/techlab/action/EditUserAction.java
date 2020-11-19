package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.User;
import com.techlab.service.UserService;
import com.techlab.viewmodel.EditUserVm;

public class EditUserAction extends ActionSupport implements ModelDriven<EditUserVm> {
	@Autowired
	private UserService service;
	private EditUserVm user;
	private String msg;

	public String execute() {
		User u = service.getUser(user.getId());
		user.setFirstname(u.getFirstName());
		user.setLastname(u.getLastName());
		user.setEmail(u.getEmail());
		user.setUsername(u.getUsername());
		user.setPassword(u.getPassword());
		return SUCCESS;
	}

	public String doEdit() {		
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
		service.editUser(user.getId(), user.getFirstname(), user.getLastname(), user.getEmail(), user.getUsername(),
				user.getPassword());
		return SUCCESS;
	}

	@Override
	public EditUserVm getModel() {
		user = new EditUserVm();
		return user;
	}

	public EditUserVm getUser() {
		return user;
	}

	public void setUser(EditUserVm user) {
		this.user = user;
	}

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
