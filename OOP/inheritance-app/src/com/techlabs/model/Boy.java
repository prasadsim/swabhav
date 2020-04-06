package com.techlabs.model;

public class Boy extends Man{
	@Override
	public void play() {
		System.out.println("Boy is Playing");
	}

	public void eat() {
		System.out.println("Boy is Eating");
	}
	
	public void run() {
		System.out.println("Boy is Running");
	}
}
