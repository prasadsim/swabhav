package com.techlabs.model;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public abstract class Person {

	private int id;
	private String address;
	private Date dob;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

	public Person(int id, String address, String dob) throws ParseException {
		this.id = id;
		this.address = address;
		this.dob = (Date) sdf.parse(dob);
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public Date getDob() {
		return dob;
	}
}
