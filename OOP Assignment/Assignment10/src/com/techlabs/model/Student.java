package com.techlabs.model;

import java.util.Date;
import java.text.ParseException;

public class Student extends Person {
	Person person;
	private Branch branch;

	public Student(int id, String address, String dob, Branch branch) throws ParseException {
		super(id, address, dob);
		this.branch = branch;

	}

	public Branch getBranch() {
		return branch;
	}

}
