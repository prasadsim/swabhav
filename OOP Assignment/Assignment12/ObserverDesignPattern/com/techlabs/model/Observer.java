package com.techlabs.model;

public abstract class Observer {
	protected Subject subject;

	public abstract void update();
}
