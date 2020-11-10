package com.techlabs.action;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action {

	private String name;

	@Override
	public String execute() throws Exception {
		System.out.println("inside hello action");
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
