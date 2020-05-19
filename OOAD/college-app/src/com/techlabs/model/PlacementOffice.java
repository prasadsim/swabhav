package com.techlabs.model;

import java.util.*;

public class PlacementOffice {
	private ArrayList<Student> placedStudents = new ArrayList<>();

	public void addStudent(Student s) {
		this.placedStudents.add(s);
	}

	public ArrayList<Student> getPlacedStudents() {
		return placedStudents;
	}
}
