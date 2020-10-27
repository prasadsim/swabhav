package com.techlabs.model;

import java.util.UUID;

public class Employee {

	private UUID id;
	private String name, role;

	public Employee(UUID id, String name, String role) {
		this.id = id;
		this.name = name;
		this.role = role;
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

}
