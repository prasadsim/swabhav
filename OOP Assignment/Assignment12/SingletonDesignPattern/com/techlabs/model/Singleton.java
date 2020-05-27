package com.techlabs.model;

public class Singleton {
	private static Singleton obj;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (obj == null) {
			obj = new Singleton();
		}
		return obj;
	}

	public void showMessage() {
		System.out.println("This is Singleton Design Pattern !");
	}

}
