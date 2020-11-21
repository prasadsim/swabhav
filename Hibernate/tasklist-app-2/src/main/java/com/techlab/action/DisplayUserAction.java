package com.techlab.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlab.entity.User;
import com.techlab.service.UserService;

public class DisplayUserAction implements Action, SessionAware {
	private List<User> users;
	@Autowired
	private UserService service;
	private SessionMap<String, Object> session;

	@Override
	public String execute() throws Exception {
		if (session.get("adminId") == null) {
			List<User> usersTemp = new ArrayList<User>();
			if (session.get("loginId") == null) {
				users = usersTemp;
				return "success";
			}
			int loginId = (int) session.get("loginId");
			System.out.println("login=" + loginId);
			User u = service.getUserById(loginId);
			System.out.println("userid=" + u.getId());
			usersTemp.add(u);
			users = usersTemp;
			System.out.println(users.size());
			return "success";
		}
		users = service.getUsers();
		return "success";
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
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