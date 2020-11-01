package com.techlabs.model;

import java.util.ArrayList;
import java.util.List;

public class PartnerCompany {

	private int id;
	private String name;
	private List<Senior> seniors = new ArrayList();

	public PartnerCompany(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void addSenior(Senior s) {
		seniors.add(s);
	}

	public int countSenior() {
		return seniors.size();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Senior> getSeniors() {
		return seniors;
	}

}
