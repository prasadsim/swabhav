package com.techlabs.action;

import java.security.AccessControlContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class WelcomeAction implements Action {

	private String developer;

	@Override
	public String execute() throws Exception {
		System.out.println("inside welcome action");
//		this.developer = ServletActionContext.getRequest().getParameter("developer");
		return "success";
	}

	public String getDeveloper() {
		return developer;
	}
	
	public void setDeveloper(String developer) {
		this.developer = developer;
	}
}
