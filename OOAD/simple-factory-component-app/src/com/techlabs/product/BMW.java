package com.techlabs.product;

class BMW implements IAuto{

	public void start() {
		System.out.println(this.getClass().getSimpleName() + " is started!");
	}

	public void stop() {
		System.out.println(this.getClass().getSimpleName() + " is stoped!");
	}
}
