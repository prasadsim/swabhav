package com.techlabs.circle.test;

import com.techlabs.circle.Circle;
import java.lang.reflect.*;

public class CircleTest3 {
	public static void main(String args[]) {
		Circle[] circles = new Circle[3];
		circles[0] = new Circle();
//		System.out.println(circles[0]);
//		displayMethods(Circle.class);
//		System.out.println("\n");
//		displayMethods(Integer.class);
//		System.out.println("\n");
//		displayMethods(CircleTest3.class);
		System.out.println(new Circle().calculateArea());
	}

	
	private static void displayMethods(Class cir) {
//		Method[] methods = cir.getMethods();
//		Class circlet = Class.forName("Circle.java");
		Method[] methods = cir.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i].getName());
		}
		System.out.println(methods.length);
//		System.out.println();

	}
}