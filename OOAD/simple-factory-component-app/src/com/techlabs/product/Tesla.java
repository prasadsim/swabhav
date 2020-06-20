package com.techlabs.product;

class Tesla implements IAuto{

	public void start() {
		System.out.println(this.getClass().getSimpleName() + " is started!");
	}

	public void stop() {
		System.out.println(this.getClass().getSimpleName() + " is stoped!");
	}
}
