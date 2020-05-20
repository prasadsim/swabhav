package com.techlabs.model;

public class Circle implements IShape {
	private final static double pie = 3.142;
	private double radius;

	public static double getPie() {
		return pie;
	}

	public double getRadius() {
		return radius;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return pie * radius * radius;
	}

}
