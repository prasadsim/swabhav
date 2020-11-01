package com.techlabs.model;

import java.util.Date;

public class Senior {

	private int id;
	private String name;
	private String designation;
	private int yearOfExp;

	public Senior(int id, String name, String designation, int yearOfExp) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.yearOfExp = yearOfExp;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public int getYearOfExp() {
		return yearOfExp;
	}

}
