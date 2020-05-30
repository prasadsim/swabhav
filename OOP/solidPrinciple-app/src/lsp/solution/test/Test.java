package lsp.solution.test;

import lsp.solution.IPolygon;
import lsp.solution.Rectangle;
import lsp.solution.Square;

public class Test {

	public static void main(String[] args) {
		IPolygon square = new Square(10);
		System.out.println("Area of Square : " + square.calculateArea());

		IPolygon rectangle = new Rectangle(20, 10);
		System.out.println("Area of Rectangle : " + rectangle.calculateArea());
		
	}
}
