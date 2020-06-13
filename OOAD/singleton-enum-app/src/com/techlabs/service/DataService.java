package com.techlabs.service;

public enum DataService {

	Instance;

	public void doSomething() {
		System.out.println("Work has done by " + this.hashCode());
	}

}
