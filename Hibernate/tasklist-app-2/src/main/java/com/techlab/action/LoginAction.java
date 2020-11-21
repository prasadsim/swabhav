package com.techlab.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.User;
import com.techlab.service.UserService;
import com.techlab.viewmodel.UserVm;

public class LoginAction extends ActionSupport implements ModelDriven<UserVm>, SessionAware {
	@Autowired
	private UserService service;
	private UserVm user;
	private String msg;
	private boolean admin;
	private SessionMap<String, Object> session;

	public String execute() {
		return SUCCESS;
	}

	public String doLogout() {
		session.remove("loginId");
		session.remove("adminId");
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
		System.out.println("username:" + user.getUser() + " password:" + user.getPass());
		for (User u : service.getUsers()) {
			if (u.getUsername().equals(user.getUser()) && u.getPassword().equals(user.getPass())) {
				if (admin) {
					session.put("adminId", u.getId());
				}
				System.out.println("confirm");
				session.put("loginId", u.getId());
				return SUCCESS;
			}
			msg = "Invalid Credentials";
		}
		return INPUT;

	}

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

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
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
