package com.techlabs.model;

public class Rectangle {
	private int width;
	private int height;
	private ColorType color;

	public Rectangle(int pwidth, int pheight, ColorType pcolor) {
		width = checkLength(pwidth);
		height = checkLength(pheight);
		color = pcolor;
	}

	public Rectangle(int pwidth, int pheight) {
		width = checkLength(pwidth);
		height = checkLength(pheight);
		//color = "RED";
	}

	public int calculateArea() {
		return width * height;
	}

	private int checkLength(int length) {
		if (length < 0) {
			length = 1;
			return length;
		}
		return length;
	}

	private String checkColor(String pcolor) {
		if (pcolor == null) {
			return "RED";
		}
		if (pcolor.equalsIgnoreCase("RED") || pcolor.equalsIgnoreCase("BLUE") || pcolor.equalsIgnoreCase("GREEN")) {
			return pcolor.toUpperCase();
		}
		return "RED";
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public ColorType getColor() {
		return color;
	}
}
