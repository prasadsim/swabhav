package com.techlabs.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Student implements Comparable {
	private String name, rollNo, associatedCompany, year;
	private Date dob;
	private float pointer;
	private Department dept;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

	public Student(String name, String rollNo, String associatedCompany, String year, String dob, float pointer,
			Department dept) throws ParseException {
		this.name = name;
		this.rollNo = rollNo;
		this.year = year;
		if (this.year != "BE") {
			this.associatedCompany = null;
		} else {
			this.associatedCompany = associatedCompany;
		}
		this.dob = sdf.parse(dob);
		this.pointer = pointer;
		this.dept = dept;
		this.dept.addStudent(this);
	}

	public String getName() {
		return name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public String getAssociatedCompany() {
		return associatedCompany;
	}

	public String getYear() {
		return year;
	}

	public Date getDob() {
		return dob;
	}

	public float getPointer() {
		return pointer;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", associatedCompany=" + associatedCompany + ", year="
				+ year + ", dob=" + dob + ", pointer=" + pointer + "]";
	}

	public Department getDept() {
		return dept;
	}

	@Override
	public int compareTo(Object arg0) {
		Student s = (Student) arg0;
		return this.rollNo.compareToIgnoreCase(s.rollNo);
	}

}
