package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginActionWithInterceptor extends ActionSupport implements SessionAware{
	
	private SessionMap<String, Object> sessionMap;
	
	public String login() {
		sessionMap
		return INPUT;
	}
	public String execute() {
		return SUCCESS;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.sessionMap=(SessionMap<String, Object>) session;
	}
}
