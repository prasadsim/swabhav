package com.techlabs.model;

public class CustomerDB implements ICrudable{

	@Override
	public void create() {
		System.out.println("Customer Create");
		
	}

	@Override
	public void read() {
		System.out.println("Customer Read");
		
	}

	@Override
	public void update() {
		System.out.println("Customer Update");
		
	}

	@Override
	public void delete() {
		System.out.println("Customer Delete");
		
	}

}
