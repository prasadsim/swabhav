package com.techlabs.action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.techlabs.service.LoginService;

public class LoginActionWithInterceptor implements SessionAware {

	private String username, password, message;
	private SessionMap<String, Object> sessionMap;
	private HttpSession session = (HttpSession) ServletActionContext.getRequest().getSession();

	public String execute() {
		sessionMap.put("user", "valid");
		return "success";
	}

	public String loginDo() {
		if (username.equals("")) {
			message = "username required";
			return "input";
		}
		if (password.equals("")) {
			message = "password required";
			return "input";
		}
		if (LoginService.getInstance().isValidate(username, password)) {
			sessionMap.put("user", "valid");
			return "success";
		}
		return "error";
	}

	public String logout() {
		sessionMap.put("user", "invalid");
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.sessionMap = (SessionMap<String, Object>) session;
	}

	public String getUsername() {
		return username;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public SessionMap<String, Object> getSessionMap() {
		return sessionMap;
	}

	public void setSessionMap(SessionMap<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

	public HttpSession getSession() {
		return session;
	}

	public void setSession(HttpSession session) {
		this.session = session;
	}

}