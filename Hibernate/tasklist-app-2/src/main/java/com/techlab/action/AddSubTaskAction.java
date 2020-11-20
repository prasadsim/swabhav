package com.techlab.action;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.Task;
import com.techlab.service.SubTaskService;
import com.techlab.viewmodel.AddSubTaskVm;
import com.techlab.viewmodel.AddTaskVm;

public class AddSubTaskAction extends ActionSupport implements ModelDriven<AddSubTaskVm>, SessionAware {

	@Autowired
	private SubTaskService service;
	private AddSubTaskVm subTask;
	private SessionMap<String, Object> session;
	private String msg;

	public String execute() {
		subTask.setDate(new Date());
		return SUCCESS;
	}

	public String doAdd() {
		if (subTask.getTitle() == "") {
			setMsg("Enter Title");
			return INPUT;
		}
		Task task = (Task) session.get("task");
		service.addSubTask(subTask.getTitle(), subTask.getDate(), task);
		return SUCCESS;
	}

	public AddSubTaskVm getSubTask() {
		return subTask;
	}

	public void setSubTask(AddSubTaskVm task) {
		this.subTask = task;
	}

	@Override
	public AddSubTaskVm getModel() {
		subTask = new AddSubTaskVm();
		return subTask;
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

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
