package com.techlabs.model;

public class Customer {
	private String id;
	private String name;
	private int orders;
	private static int count;

	static {
		count = 1000;
	}

	public Customer(String name, int orders) {
		count++;
		this.id = "C" + count;
		this.name = name;
		this.orders = orders;
	}

	public String getId() {
		return id;
	}

}
