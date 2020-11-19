package com.techlab.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.entity.Task;
import com.techlab.entity.User;
import com.techlab.repository.TaskRepository;

@Service
public class TaskService {
	@Autowired
	private TaskRepository repo;

	public List<Task> getTasks(int id) {
		return repo.getTasks(id);
	}

	public void addTask(String title, Date date, User user) {
		repo.addTask(title, date, user);
	}

	public void deleteTask(int id) {
		repo.deleteTask(id);
	}

	public void editTask(int id, String title, boolean done) {
		repo.editTask(id, title, done);
	}

	public Task getTask(int id) {
		return repo.getTask(id);
	}

	public void updateStatus(int id, boolean done, Date date) {
		repo.updateTask(id, done, date);
	}

}