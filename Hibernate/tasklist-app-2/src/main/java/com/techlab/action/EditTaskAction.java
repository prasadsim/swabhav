package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.Task;
import com.techlab.service.TaskService;
import com.techlab.viewmodel.EditTaskVm;

public class EditTaskAction extends ActionSupport implements ModelDriven<EditTaskVm> {
	@Autowired
	private TaskService service;
	private EditTaskVm task;
	private String msg;

	public String execute() {
		Task t = service.getTask(task.getId());
		task.setTitle(t.getTitle());
		task.setDone(t.getDone());
		return SUCCESS;
	}

	public String doEdit() {
		if (task.getTitle() == "") {
			msg = "Enter Title";
			return INPUT;
		}
		service.editTask(task.getId(), task.getTitle(), task.getDone());
		return SUCCESS;
	}

	@Override
	public EditTaskVm getModel() {
		task = new EditTaskVm();
		return task;
	}

	public EditTaskVm getTask() {
		return task;
	}

	public void setTask(EditTaskVm task) {
		this.task = task;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
