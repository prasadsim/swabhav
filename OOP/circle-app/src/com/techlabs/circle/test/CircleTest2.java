package com.techlabs.circle.test;

import com.techlabs.circle.Circle;

public class CircleTest2 {
	public static void main(String[] args) {
		Circle[] circles = new Circle[5];
		for (int i = 0; i < 5; i++) {
			circles[i] = new Circle();
		}
		circles[0].setRadius(5);
		circles[1].setRadius(15);
		circles[2].setRadius(20);
		circles[3].setRadius(7);
		circles[4].setRadius(25);

//		printInfo(circles);
		findSmallCircle(circles);
		findBigCircle(circles);
	}

	private static void findSmallCircle(Circle[] cir) {
		float result = cir[0].getRadius();
		int position = 0;
		for (int i = 1; i < cir.length; i++) {
			if (result > cir[i].getRadius()) {
				result = cir[i].getRadius();
				position = i;
			}
		}
		printInfo(cir[position]);
	}

	private static void findBigCircle(Circle[] cir) {
		float result = cir[0].getRadius();
		int position = 0;
		for (int i = 1; i < cir.length; i++) {
			if (result < cir[i].getRadius()) {
				result = cir[i].getRadius();
				position = i;
			}
		}
		printInfo(cir[position]);
	}

	private static void printInfo(Circle[] cir) {
		for (int i = 0; i < cir.length; i++) {
			printInfo(cir[i]);
		}
	}

	private static void printInfo(Circle circle) {
		System.out.println("Radius:" + circle.getRadius());
		System.out.println("Area:" + circle.calculateArea());
		System.out.println("Circumference:" + circle.calculateCircumference());
		System.out.println();
	}
}
