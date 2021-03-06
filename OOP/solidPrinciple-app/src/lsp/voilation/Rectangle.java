package lsp.voilation;

public class Rectangle {
	protected int height;
	protected int width;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int calculateArea() {
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
