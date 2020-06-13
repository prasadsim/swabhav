package com.techlabs.model;

import java.util.UUID;

public class Talent {
	private UUID id;
	private String name;
	private double cgpa;
	private String partner;
	private String techStack;

	public Talent(UUID id, String name, double cgpa, String partner, String techStack) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		this.partner = partner;
		this.techStack = techStack;
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

	public String getTechStack() {
		return techStack;
	}

	public String getPartner() {
		return partner;
	}

}
