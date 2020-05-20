package com.techlabs.model.test;

import com.techlabs.model.*;

public class OCPTest {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5, 4);
		Square square = new Square(5);
		Circle circle = new Circle(5);

		IShape[] shapes = { rect, square, circle };

		printInfo(shapes);
	}

	private static void printInfo(IShape[] shapes) {
		for (IShape shape : shapes) {
			System.out.println(shape);
			System.out.println("Area:" + shape.getArea() + "\n");
		}
	}
}
