package com.techlabs.model;

import java.util.Date;
import java.text.ParseException;

public class Student {
	Person person;
	private Branch branch;

	public Student(Person person, Branch branch) throws ParseException {
		this.person=person;
		this.branch = branch;

	}
	public Person getPerson() {
		return person;
	}
	public Branch getBranch() {
		return branch;
	}

}
