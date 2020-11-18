package com.techlab.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.viewmodel.UserVm;

public class LoginAction extends ActionSupport implements SessionAware, ModelDriven<UserVm> {

	private UserVm user;
	private String message = null;

	public UserVm getUser() {
		return user;
	}

	public void setUser(UserVm user) {
		this.user = user;
	}

	private SessionMap<String, Object> session;

	public String execute() {
		return SUCCESS;
	}

	public String doLogin() {
		if (user.getUsername() == "") {
			message = "enter username";
			return "input";
		}
		if (user.getPassword() == "") {
			message = "enter Password";
			return "input";
		}
		if (user.getUsername().equals("ash") && user.getPassword().equals("ash")) {
			return "success";
		} else {
			return "input";
		}
	}

	@Override
	public UserVm getModel() {
		user = new UserVm();
		return user;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
