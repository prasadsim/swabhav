package com.techlabs.model;

public class Square implements IShape {
	private double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	@Override
	public double getArea() {
		return side * side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
}