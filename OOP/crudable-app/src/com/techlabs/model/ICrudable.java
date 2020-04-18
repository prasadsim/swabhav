package com.techlabs.model;

public abstract interface ICrudable {

	public abstract void create();

	public abstract void read();

	public abstract void update();

	public abstract void delete();

}
