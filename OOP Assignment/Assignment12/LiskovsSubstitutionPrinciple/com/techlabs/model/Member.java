package com.techlabs.model;

public class Member implements IDataBase1, IBooking {
	private String name;

	public Member(String name) {
		this.name = name;
	}

	@Override
	public void addToDatabase() {
		System.out.println(name + " Member adding to database....");
	}

	@Override
	public void makeBooking() {
		System.out.println(name + "Member making Booking......");
	}
}
