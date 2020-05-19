package com.techlabs.model;

import java.util.*;

public class College {
	private int collegeId;
	private String collegeName;
	private String collegeAddress;
	private ArrayList<Student> stu = new ArrayList<>();
	private ArrayList<Department> dept = new ArrayList<>();
	private PlacementOffice po = new PlacementOffice();

	public College(int collegeId, String collegeName, String collegeAddress) {
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
	}

	public void addStudent(Student s) {
		if (s.getAssociatedCompany() != null) {
			this.po.addStudent(s);
			this.stu.add(s);
		} else {
			stu.add(s);
		}
		Collections.sort(stu, new RollNoComparator());

	}

	public PlacementOffice getPo() {
		return po;
	}

	public void addDept(Department d) {
		dept.add(d);
	}

	public ArrayList<Student> getStu() {
		return stu;
	}

	public ArrayList<Department> getDept() {
		return dept;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public String getCollegeAddress() {
		return collegeAddress;
	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeAddress=" + collegeAddress
				+ "]";
	}

}
