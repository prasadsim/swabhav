package com.techlab.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.User;
import com.techlab.service.UserService;
import com.techlab.viewmodel.EditUserVm;

public class EditUserAction extends ActionSupport implements ModelDriven<EditUserVm>, SessionAware {
	@Autowired
	private UserService service;
	private EditUserVm user;
	private String msg;
	private SessionMap<String, Object> session;

	public String execute() {
		User u = service.getUserById(user.getId());
		user.setFirstname(u.getFirstName());
		user.setLastname(u.getLastName());
		user.setEmail(u.getEmail());
		user.setUsername(u.getUsername());
		user.setPassword(u.getPassword());
		user.setBlocked(u.getBlocked());
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
		if (session.get("adminId") == null) {
			msg = "You cannot Accesss!!!";
			return INPUT;
		}
		service.editUser(user.getId(), user.getFirstname(), user.getLastname(), user.getEmail(), user.getUsername(),
				user.getPassword(), user.getBlocked());
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

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}

	public SessionMap<String, Object> getSession() {
		return session;
	}

	public void setSession(SessionMap<String, Object> session) {
		this.session = session;
	}

}
