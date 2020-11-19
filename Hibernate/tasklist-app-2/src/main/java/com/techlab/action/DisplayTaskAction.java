package com.techlab.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.entity.Task;
import com.techlab.entity.User;
import com.techlab.service.TaskService;
import com.techlab.service.UserService;

public class DisplayTaskAction extends ActionSupport implements SessionAware {

	@Autowired
	private TaskService service;
	private SessionMap<String, Object> session;

	private List<Task> tasks;
	private int id;

	public String execute() {
		User user = (User) session.get("user");
		if (user == null)
			return ERROR;
		tasks = service.getTasks(user.getId());
		return SUCCESS;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
