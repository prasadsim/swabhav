package com.techlabs.model;

public class Customer {
	private static String id;
	private String name;
	private int orders;
	private static int count;
	
	static {
		count=1000;
	}

	public Customer(String name, int orders) {
		this.id='C'+String.valueOf(++count);
		this.name = name;
		this.orders = orders;
	}
	
	public static String getId() {
		return id;
	}

}
