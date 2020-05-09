package com.techlabs.model;

public class ClassA {
	private IDecopuler decouple;

	public ClassA(IDecopuler o) {
		this.decouple = o;
	}

	public void bar() {
		decouple.foo();
	}

}
