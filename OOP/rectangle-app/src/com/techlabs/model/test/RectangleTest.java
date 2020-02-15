package com.techlabs.model.test;

import com.techlabs.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle small = new Rectangle();
		Rectangle big = new Rectangle();
		
		small.height = 10;
		small.width = 5;
		System.out.println("Small height:" + small.height + "\nSmall Weidth:" + small.width);
		int smallArea = small.calculateArea();
		System.out.println("Area of small rectanlge:" + smallArea + "\n");
		
		big.height = 100;
		big.width = 50;
		System.out.println("big height:" + big.height + "\nbig Weidth:" + big.width);
		int bigArea = big.calculateArea();
		System.out.println("Area of big rectanlge:" + bigArea);

	}
}
