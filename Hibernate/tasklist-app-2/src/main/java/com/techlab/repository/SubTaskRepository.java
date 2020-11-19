package com.techlab.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlab.entity.SubTask;
import com.techlab.entity.Task;

@Repository
@Transactional
public class SubTaskRepository {
	@Autowired
	private SessionFactory fact;

	public List<SubTask> getSubTasks(int id) {
		List<SubTask> subTasks = new ArrayList<SubTask>();
		for (SubTask task : (List<SubTask>) fact.getCurrentSession().createQuery("from SubTask").list()) {
			if (task.getTask().getId() == id) {
				subTasks.add(task);
			}
		}
		return subTasks;
	}

	public void addSubTask(String title, Date date, Task task) {
		SubTask subTask = new SubTask(title, date, false, task);
		fact.getCurrentSession().save(subTask);
	}

	public void deleteSubTask(int id) {
		fact.getCurrentSession().delete(getSubTask(id));
	}

	public void editSubTask(int id, String title, boolean done) {
		SubTask subTask = getSubTask(id);
		subTask.setTitle(title);
		subTask.setDone(done);
		fact.getCurrentSession().update(subTask);
	}

	public SubTask getSubTask(int id) {
		for (SubTask subTask : (List<SubTask>) fact.getCurrentSession().createQuery("from SubTask").list()) {
			if (subTask.getId() == id)
				return subTask;
		}
		return null;
	}

	public void updateSubTask(int id, boolean done, Date date) {
		SubTask task = getSubTask(id);
		task.setDone(done);
		task.setDate(date);
		fact.getCurrentSession().update(task);
	}

}
