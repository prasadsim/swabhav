package lsp.solution;

public class Square extends Shape {
	private int side;

	public Square(int side) {
		this.side = side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	@Override
	public double calculateArea() {
		return side * side;
	}

}
