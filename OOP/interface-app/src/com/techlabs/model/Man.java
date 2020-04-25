package com.techlabs.model;

public class Man implements IMannerable {

	@Override
	public void wish() {
		System.out.println("Man is Wishing");		
	}

	@Override
	public void depart() {
		System.out.println("Man is Departing");		
	}
	

}
