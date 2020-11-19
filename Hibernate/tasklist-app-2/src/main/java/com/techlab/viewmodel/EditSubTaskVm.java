package com.techlab.viewmodel;

public class EditSubTaskVm extends AddSubTaskVm {

	private int id;
	private boolean done;

	public boolean getDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
