package lsp.voilation;

public class Square extends Rectangle {

	public Square(int side) {
		super(side, side);
	}

	@Override
	public int calculateArea() {
		return super.calculateArea();
	}

	@Override
	public void setHeight(int height) {
		this.height = this.width = height;
	}

	@Override
	public void setWidth(int width) {
		this.height = this.width = width;
	}

	@Override
	public int getHeight() {
		return super.getHeight();
	}

	@Override
	public int getWidth() {
		return super.getWidth();
	}

}
