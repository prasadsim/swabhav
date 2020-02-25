package com.techlabs.circle.test;

import com.techlabs.circle.Circle;

public class CircleTest1 {
	public static void main(String args[]) {
		Circle c1 = new Circle();
		System.out.println("Radius:" + c1.getRadius());
		c1.setRadius(25);
		printInfo(c1);
	}

	private static void printInfo(Circle c) {
		System.out.println("Radius:" + c.getRadius());
		System.out.println("Area:" + c.calculateArea());
		System.out.println("Circumference:" + c.calculateCircumference());
	}

}
