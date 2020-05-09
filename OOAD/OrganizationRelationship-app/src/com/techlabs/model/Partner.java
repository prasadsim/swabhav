package com.techlabs.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Partner {

	private UUID id;
	private String name;
	private double companyTurnOver;
	private int empStrength;
	private List<Talent> talents = new ArrayList<Talent>();

	public Partner(UUID id, String name, double companyTurnOver, int empStrength) throws UnsupportedOperationException {
		this.id = id;
		this.name = name;
		this.companyTurnOver = companyTurnOver;
		this.empStrength = empStrength;
	}

	public void addTalent(Talent talent) {
		this.talents.add(talent);
	}

	public int countTalent() {
		return talents.size();
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCompanyTurnOver() {
		return companyTurnOver;
	}

	public int getEmpStrength() {
		return empStrength;
	}

	public Iterable<Talent> getTalents() {
		return talents;
	}
}
