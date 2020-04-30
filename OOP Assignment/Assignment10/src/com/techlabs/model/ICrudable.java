package com.techlabs.model;

public interface ICrudable {

	public void create(int element);

	public void read();

	public void update(int index, int element);

	public void delete(int index);

	public void search(int element);

}
