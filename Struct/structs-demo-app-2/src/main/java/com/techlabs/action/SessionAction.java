package com.techlabs.action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

public class SessionAction implements SessionAware {

	private SessionMap<String, Object> sessionMap;

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap = (SessionMap<String, Object>) session;
	}

	public String execute() {
		System.out.println("inside session action");
		HttpSession session = (HttpSession) ServletActionContext.getRequest().getSession();
		if (session.getAttribute("count") == null) {
			sessionMap.put("count", 0);
		} else {
			sessionMap.put("count", (int) session.getAttribute("count") + 1);
		}

		return "success";
	}

}
