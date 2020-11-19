package com.techlab.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.entity.SubTask;
import com.techlab.entity.Task;
import com.techlab.entity.User;
import com.techlab.service.SubTaskService;

public class DisplaySubTaskAction extends ActionSupport implements SessionAware {

	@Autowired
	private SubTaskService service;
	private SessionMap<String, Object> session;

	private List<SubTask> subTasks;
	private int id;

	public String execute() {
		Task task = (Task) session.get("task");
		if (task == null)
			return ERROR;
		subTasks = service.getSubTasks(task.getId());
		return SUCCESS;
	}

	public List<SubTask> getSubTasks() {
		return subTasks;
	}

	public void setSubTasks(List<SubTask> subTasks) {
		this.subTasks = subTasks;
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
