package com.techlabs.factory;

public class BMW implements IAuto {

	@Override
	public void start() {
		System.out.println(this.getClass().getSimpleName() + " is started!");
	}

	@Override
	public void stop() {
		System.out.println(this.getClass().getSimpleName() + " is stoped!");
	}

}
