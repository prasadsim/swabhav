package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectanlgeRefTest {

	public static void main(String args[]) {
		Rectangle small = null; // small expects an object

		System.out.println(small);
		small = new Rectangle(); // gets an object of Rectangle
		System.out.println(small);

		small.height = 50;
		small.width = 10;
		System.out.printf("Width:%d, Height=%d, Area=%d", small.height, small.width, small.calculateArea());
		
		small.height=1000; //voilating encapsulation because ist 
		small.width=5000;
		System.out.printf("Width:%d, Height=%d, Area=%d", small.height, small.width, small.calculateArea());

	}
}
