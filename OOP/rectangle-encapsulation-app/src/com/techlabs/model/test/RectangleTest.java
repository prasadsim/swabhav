package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectangleTest {
	public static void main(String args[]) {
		Rectangle rect = new Rectangle();
		rect.changeHeight(10);
		rect.changeWidth(50);
		System.out.println("Height:" + rect.readHeight() + "\tWidth:" + rect.readWidth());

		System.out.println();

		rect.changeHeight(110);
		rect.changeWidth(-10);
		System.out.println("Height:" + rect.readHeight() + "\tWidth:" + rect.readWidth());

		System.out.println();

		rect.changeHeight(-10);
		rect.changeWidth(110);
		System.out.println("Height:" + rect.readHeight() + "\tWidth:" + rect.readWidth());
	}
}
