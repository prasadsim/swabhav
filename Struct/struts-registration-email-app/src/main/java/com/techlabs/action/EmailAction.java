package com.techlabs.action;

import com.opensymphony.xwork2.Action;
import com.techlabs.service.EmailService;

public class EmailAction implements Action {

	private String from, password, to, subject, body;
	private EmailService service = null;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String execute() throws Exception {
		service = new EmailService();
		boolean result = service.sendMail(from, password, to, subject, body);
		if (result) {
			return SUCCESS;
		}
		return ERROR;
	}

	public EmailService getService() {
		return service;
	}

	public void setService(EmailService service) {
		this.service = service;
	}

}
