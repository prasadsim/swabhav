package com.techlab.action;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.User;
import com.techlab.service.TaskService;
import com.techlab.viewmodel.AddTaskVm;

public class AddTaskAction extends ActionSupport implements ModelDriven<AddTaskVm>, SessionAware {

	@Autowired
	private TaskService service;
	private AddTaskVm task;
	private SessionMap<String, Object> session;

	public String execute() {
		task.setDate(new Date());
		return SUCCESS;
	}

	public String doAdd() {
		User user = (User) session.get("user");
		service.addTask(task.getTitle(), task.getDate(), user);
		return SUCCESS;
	}

	public AddTaskVm getTask() {
		return task;
	}

	public void setTask(AddTaskVm task) {
		this.task = task;
	}

	@Override
	public AddTaskVm getModel() {
		task = new AddTaskVm();
		return task;
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
