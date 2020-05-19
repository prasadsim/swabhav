package com.techlabs.model;

import java.util.*;

public class Department {
	private String deptName;
	private int deptId;
	private Map<String, String> subAndProf = new TreeMap<>();
	private ArrayList<Student> stu = new ArrayList<>();

	public Department(String deptName, int deptId) {
		this.deptName = deptName;
		this.deptId = deptId;
	}

	public void addSubjectAndProfessor(String sub, String prof) {
		this.subAndProf.put(sub, prof);
	}

	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", deptId=" + deptId + "]";
	}

	public void addStudent(Student s) {
		stu.add(s);
		Collections.sort(stu, new RollNoComparator());
	}

	public String getDeptName() {
		return deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public Map<String, String> getSubAndProf() {
		return subAndProf;
	}

	public ArrayList<Student> getStu() {
		return stu;
	}

}
