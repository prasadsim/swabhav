package lsp.solution.test;

import lsp.solution.Rectangle;
import lsp.solution.Square;

public class Test {

	public static void main(String[] args) {
		Square square = new Square(10);
		System.out.println("Area of Square : " + square.calculateArea());

		Rectangle rectangle = new Rectangle(20, 10);
		System.out.println("Area of Rectangle : " + rectangle.calculateArea());
		
	}
}
