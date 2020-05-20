package com.techlabs.model;

public class Rectangle implements IShape {
	private double height, width;

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	@Override
	public double getArea() {
		return this.height * this.width;
	}

}
