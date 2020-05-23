package lsp.voilation.test;

import lsp.voilation.Rectangle;
import lsp.voilation.Square;

public class Test {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10, 5);
		System.out.println(rect.calculateArea());
		Square square = new Square(10);
		System.out.println(square.calculateArea());

		checkWidthWithChangeInHeight(rect);
		checkWidthWithChangeInHeight(new Square(15));
	}

	private static void checkWidthWithChangeInHeight(Rectangle rect) {
		int beforeChange = rect.getWidth();
		rect.setHeight(rect.getHeight() + 10);
		int afterChange = rect.getWidth();
		System.out.println(beforeChange == afterChange);

	}
}
