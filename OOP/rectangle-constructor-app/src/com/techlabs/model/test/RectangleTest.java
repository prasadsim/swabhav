package com.techlabs.model.test;

import com.techlabs.model.ColorType;
import com.techlabs.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(-10, 5, ColorType.RED);
		printDetails(r1);

		Rectangle r2 = new Rectangle(-20, -10);
		printDetails(r2);

		Rectangle r3 = new Rectangle(0, 0, ColorType.GREEN);
		printDetails(r3);

		Rectangle r4 = new Rectangle(15, 5, ColorType.BLUE);
		printDetails(r4);

		Rectangle r5 = new Rectangle(10, 20, null);
		printDetails(r5);
	}

	private static void printDetails(Rectangle r) {
		System.out.println("Width:" + r.getWidth());
		System.out.println("Height:" + r.getHeight());
		System.out.println("Color:" + r.getColor());
		System.out.println("Area:" + r.calculateArea());
		System.out.println();
	}
}