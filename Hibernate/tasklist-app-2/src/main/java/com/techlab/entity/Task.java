package com.techlab.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Task {

	@Id
	@GeneratedValue
	private int id;
	private String title;
	private Date date;
	private boolean done;

	@ManyToOne
	@JoinColumn
	private User user;

	public Task() {
	}

	public Task(String title, Date date, boolean done, User user) {
		this.title = title;
		this.date = date;
		this.done = done;
		this.user = user;
	}

	@OneToMany(mappedBy = "task", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<SubTask> subTask = new HashSet<SubTask>();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<SubTask> getSubTask() {
		return subTask;
	}

	public void setSubTask(Set<SubTask> subTask) {
		this.subTask = subTask;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean getDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

}