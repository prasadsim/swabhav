package com.techlabs.model;

public class Dog implements IPet {

	@Override
	public void eat() {
		System.out.println("Dog is eatting!");
	}

	@Override
	public void groom() {
		System.out.println("Dog is Grooming!");
	}

}
