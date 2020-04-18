package com.techlabs.model;

public class AddressDB implements ICrudable{

	@Override
	public void create() {
		System.out.println("Address Create");
		
	}

	@Override
	public void read() {
		System.out.println("Address Read");
		
	}

	@Override
	public void update() {
		System.out.println("Address Update");
		
	}

	@Override
	public void delete() {
		System.out.println("Address Delete");
		
	}
	

}
