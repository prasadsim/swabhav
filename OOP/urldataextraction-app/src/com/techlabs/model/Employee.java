package com.techlabs.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private int eid, comm, deptno, managerId;
	private String ename, role;
	private double salary;
	private Date doj;

	public Employee(int eid, String ename, String role, int managerId, String doj, double salary, int comm, int deptno)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");
		this.eid = eid;
		this.ename = ename;
		this.role = role;
		this.managerId = managerId;
		this.doj = (Date) sdf.parse(doj);
		this.salary = salary;
		this.comm = comm;
		this.deptno = deptno;
	}

	public int getEid() {
		return eid;
	}

	public int getDeptno() {
		return deptno;
	}

	public int getManagerId() {
		return managerId;
	}

	public String getEname() {
		return ename;
	}

	public String getRole() {
		return role;
	}

	public Date getDoj() {
		return doj;
	}

	public int getComm() {
		return comm;
	}

	public double getSalary() {
		return salary;
	}

}
