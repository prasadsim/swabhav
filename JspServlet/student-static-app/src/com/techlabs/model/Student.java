package com.techlabs.model;

import java.util.UUID;

public class Student {

	private String id, name;
	private int rollno, age;

	public Student(UUID id, String name, int rollno, int age) {
		this.id = id.toString();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
	
	public void setId(String id) {
		this.id=id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getRollno() {
		return rollno;
	}

	public int getAge() {
		return age;
	}

}
