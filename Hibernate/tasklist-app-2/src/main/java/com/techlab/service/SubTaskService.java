package com.techlab.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.entity.SubTask;
import com.techlab.entity.Task;
import com.techlab.repository.SubTaskRepository;

@Service
public class SubTaskService {

	@Autowired
	private SubTaskRepository repo;

	public List<SubTask> getSubTasks(int id) {
		return repo.getSubTasks(id);
	}

	public void addSubTask(String title, Date date, Task task) {
		repo.addSubTask(title, date, task);
	}

	public void deleteSubTask(int id) {
		repo.deleteSubTask(id);
	}

	public void editSubTask(int id, String title, boolean done) {
		repo.editSubTask(id, title, done);
	}

	public SubTask getSubTask(int id) {
		return repo.getSubTask(id);
	}

	public void updateStatus(int id, boolean done, Date date) {
		repo.updateSubTask(id, done, date);
	}
}
