package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectanglePrintTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.changeHeight(105);
		r1.changeWidth(5);
		printInfo(r1);
		r2.changeHeight(15);
		r2.changeWidth(12);
		printInfo(r2);
	}

	private static void printInfo(Rectangle r) {
		System.out.println(r.readHeight());
		System.out.println(r.readWidth());
	}
}
