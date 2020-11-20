package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.SubTask;
import com.techlab.entity.Task;
import com.techlab.service.SubTaskService;
import com.techlab.viewmodel.EditSubTaskVm;
import com.techlab.viewmodel.EditTaskVm;

public class EditSubTaskAction extends ActionSupport implements ModelDriven<EditSubTaskVm> {
	@Autowired
	private SubTaskService service;
	private EditSubTaskVm subTask;
	private String msg;

	public String execute() {
		SubTask t = service.getSubTask(subTask.getId());
		subTask.setTitle(t.getTitle());
		subTask.setDone(t.getDone());
		return SUCCESS;
	}

	public String doEdit() {
		if (subTask.getTitle() == "") {
			msg = "Enter Title";
			return INPUT;
		}
		service.editSubTask(subTask.getId(), subTask.getTitle(), subTask.getDone());
		return SUCCESS;
	}

	@Override
	public EditSubTaskVm getModel() {
		subTask = new EditSubTaskVm();
		return subTask;
	}

	public EditSubTaskVm getSubTask() {
		return subTask;
	}

	public void setSubTask(EditSubTaskVm subTask) {
		this.subTask = subTask;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
