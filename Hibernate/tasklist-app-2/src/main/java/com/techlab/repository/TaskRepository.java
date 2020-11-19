package com.techlab.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlab.entity.Task;
import com.techlab.entity.User;

@Repository
@Transactional
public class TaskRepository {
	@Autowired
	private SessionFactory fact;

	public List<Task> getTasks(int id) {
		List<Task> tasks = new ArrayList<Task>();
		for (Task task : (List<Task>) fact.getCurrentSession().createQuery("from Task").list()) {
			if (task.getUser().getId() == id) {
				tasks.add(task);
			}
		}
		return tasks;
	}

	public void addTask(String title, Date date, User user) {
		Task task = new Task(title, date, false, user);
		fact.getCurrentSession().save(task);
	}

	public void deleteTask(int id) {
		fact.getCurrentSession().delete(getTask(id));
	}

	public void editTask(int id, String title, boolean done) {
		Task task = getTask(id);
		task.setTitle(title);
		task.setDone(done);
		fact.getCurrentSession().update(task);
	}

	public Task getTask(int id) {
		for (Task task : (List<Task>) fact.getCurrentSession().createQuery("from Task").list()) {
			if (task.getId() == id)
				return task;
		}
		return null;
	}

	public void updateTask(int id, boolean done, Date date) {
		Task task = getTask(id);
		task.setDone(done);
		task.setDate(date);
		fact.getCurrentSession().update(task);
	}
}
