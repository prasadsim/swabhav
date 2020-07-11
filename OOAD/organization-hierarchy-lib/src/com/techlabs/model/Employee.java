package com.techlabs.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Employee implements Comparable {

	private int eid, comm, deptno, managerId;
	private String ename, role;
	private double salary;
	private Date doj;
	private List<Employee> reporters = new ArrayList<>();

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

	public void addReporters(Employee e) {
		reporters.add(e);
	}

	public Collection<Employee> getReporters() {
		return reporters;
	}

	@Override
	public int hashCode() {
		return this.eid;
	}

	@Override
	public String toString() {
		return "Id:" + this.eid + "\t\tName:" + this.ename + "\tDes:" + this.role + "\tManagerId:" + this.managerId;
	}

	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		if (this.hashCode() == e.hashCode())
			return 0;
		return 1;
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
