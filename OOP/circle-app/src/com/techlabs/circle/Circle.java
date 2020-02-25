package com.techlabs.circle;

public class Circle {
	private final float PI = 3.14f;
	private float radius;

	public void setRadius(float rad) {
		radius = rad;
	}

	public float getRadius() {
		return radius;
	}

	public float calculateArea() {
		return PI * radius * radius;
	}

	public float calculateCircumference() {
		return 2 * PI * radius;
	}
}
