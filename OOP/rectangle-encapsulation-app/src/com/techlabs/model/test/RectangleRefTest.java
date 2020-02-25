package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectangleRefTest {
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		Rectangle r2;
		r2 = r1;
		r2.changeWidth(r2.readWidth() + 1);
		r2.changeHeight(r2.readHeight() + 1);
		System.out.println("R1 Height:" + r1.readHeight());
		System.out.println("R1 Width:" + r1.readWidth());
		System.out.println("R2 Height:" + r2.readHeight());
		System.out.println("R2 Width:" + r2.readWidth());

		Rectangle r3 = new Rectangle();
		r2 = r3;
		r3.changeHeight(r3.readHeight()+2);
		r3.changeWidth(r3.readWidth()+2);
		System.out.println(r2.readHeight());
		System.out.println(r2.readWidth());
		System.out.println("R2 Height:" + r2.readHeight());
		System.out.println("R2 Width:" + r2.readWidth());

	}

}
