package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectangleArrayOfObjectTest {
	public static void main(String[] args) {
		Rectangle[] rectangles = new Rectangle[3];

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();

		rectangles[0] = new Rectangle();
		rectangles[0].changeHeight(10);
		rectangles[0].changeWidth(5);

		rectangles[1] = r1;
		rectangles[2] = r2;

		rectangles[1].changeHeight(16);
		rectangles[1].changeWidth(10);

		rectangles[2].changeHeight(2);
		rectangles[2].changeWidth(-3);

		printInfo(rectangles);
	}

	private static void printInfo(Rectangle[] rect) {
		System.out.println("Array of Rectangles\n");
		for (int i = 0; i < rect.length; i++) {
			System.out.println("height:" + rect[i].readHeight());
			System.out.println("width:" + rect[i].readWidth());
			System.out.println("Area:" + rect[i].calculateArea());
			System.out.println();
		}
	}
}
