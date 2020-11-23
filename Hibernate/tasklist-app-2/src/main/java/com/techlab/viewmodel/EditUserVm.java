package com.techlab.viewmodel;

public class EditUserVm extends AddUserVm {
	private int id;
	private boolean blocked;

	public boolean getBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}