package com.techlabs.model;

import java.util.ArrayList;
import java.util.List;

public class Company {

	private int id;
	private String name;
	private List<PartnerCompany> partners = new ArrayList();
	private List<Senior> seniors = new ArrayList();

	public Company(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void addPartner(PartnerCompany p) {
		partners.add(p);
	}

	public void addSenior(Senior s) {
		seniors.add(s);
	}

	public int countPartner() {
		return partners.size();
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

	public List<PartnerCompany> getPartners() {
		return partners;
	}

	public List<Senior> getSeniors() {
		return seniors;
	}

}
