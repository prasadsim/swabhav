package com.techlabs.action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor implements SessionAware {

	private SessionMap<String, Object> sessionMap;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {

		HttpSession session = ServletActionContext.getRequest().getSession(false);
		System.out.println("pre processing");

		if (session.getAttribute("user") == null) {
			return "input";
		}
		String result = invocation.invoke();
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap = (SessionMap<String, Object>) session;
	}

}
