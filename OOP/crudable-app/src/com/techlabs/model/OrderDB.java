package com.techlabs.model;

public class OrderDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("Order Create");
		
	}

	@Override
	public void read() {
		System.out.println("Order Read");
		
	}

	@Override
	public void update() {
		System.out.println("Order Update");
		
	}

	@Override
	public void delete() {
		System.out.println("Order Delete");
		
	}

}
