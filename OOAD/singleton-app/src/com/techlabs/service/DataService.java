package com.techlabs.service;

public class DataService {

	private static DataService instance;

	private DataService() {
		System.out.println("service created");
	}

	public static DataService getInstance() {
		if (instance == null) {
			instance = new DataService();
		}
		return instance;
	}

	public void doSomething() {
		System.out.println("Work is done by " + this.hashCode());
	}

}
