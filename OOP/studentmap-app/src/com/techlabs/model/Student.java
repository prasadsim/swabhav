package com.techlabs.model;

public class Student {
	private int rollno, std;
	private String name;
	private double cgpa;

	public Student(int rollno, int std, String name, double cgpa) {
		this.rollno = rollno;
		this.std = std;
		this.name = name;
		this.cgpa = cgpa;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(rollno + "" + std);
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if (this.hashCode() == s.hashCode()) {
			return true;
		} else {
			return false;
		}
	}

	public int getRollno() {
		return rollno;
	}

	public int getStd() {
		return std;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

}
