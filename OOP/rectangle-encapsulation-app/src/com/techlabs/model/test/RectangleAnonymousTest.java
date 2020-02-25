package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectangleAnonymousTest {
	public static void main(String[] args) {
		System.out.println(new Rectangle());
//
		new Rectangle().readHeight();
		new Rectangle().readWidth();
//
//		setInfo(new Rectangle);
//		printInfo(new Rectangle());
//		new Rectangle().changeWidth(5);

//		System.out.println();
//
		System.out.println(new Rectangle().readHeight());
//		System.out.println(new Rectangle().readWidth());
		
	}

	private static void setInfo(Rectangle r) {
		r.changeHeight(10);
		r.changeWidth(5);
	}

	private static void printInfo(Rectangle r) {
		System.out.println(r.readHeight());
		System.out.println(r.readWidth());
	}
}
