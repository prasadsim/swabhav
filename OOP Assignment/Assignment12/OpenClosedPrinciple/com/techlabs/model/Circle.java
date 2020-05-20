package com.techlabs.model;

public class Circle implements IShape {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}