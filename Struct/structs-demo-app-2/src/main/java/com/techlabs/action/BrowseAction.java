package com.techlabs.action;

import java.util.Date;

import com.opensymphony.xwork2.Action;

public class BrowseAction implements Action {

	private Date date = new Date();
	private int hours = date.getHours();
	private String msg;

	@Override
	public String execute() throws Exception {
		System.out.println("inside browse action");
		System.out.println(hours);
		System.out.println(date);
		if (hours >= 1 && hours < 12) {
			this.msg = "Good Morning";
		} else if (hours >= 12 && hours < 16) {
			this.msg = "Good Afternoon";
		} else if (hours >= 16 && hours < 21) {
			this.msg = "Good Evening";
		} else if (hours >= 21 && hours < 24) {
			this.msg = "Good Night";
		}
		return "success";
	}

	public String getMsg() {
		return this.msg;
	}

	public Date getDate() {
		return date;
	}

	public int getHours() {
		return hours;
	}

}
