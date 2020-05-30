package lsp.solution;

public class Rectangle implements IPolygon {
	protected int height;
	protected int width;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public double calculateArea() {
		return this.height * this.width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

}
