package com.techlabs.com;

public class ShapeMaker {
	private Square square;
	private Circle circle;
	private Rectangle rectangle;

	public ShapeMaker() {
		square = new Square();
		circle = new Circle();
		rectangle = new Rectangle();
	}

	public void drawSquare() {
		square.draw();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

}
