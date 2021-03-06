package com.techlabs.model;

import java.util.UUID;

public class Employee {
	private String id;
	private String name;
	private String role;

	public Employee(UUID id, String name, String role) {
		this.id = id.toString();
		this.name = name;
		this.role = role;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

}
