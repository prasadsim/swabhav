package com.techlabs.model;

public class Rectangle {
	public final int MAX = 100;
	public final int MIN = 1;
	private int height;
	private int width;

	public int checkDimension(int length) {
		if (length < MIN) {
			length = MIN;
			return length;
		} else if (length > MAX) {
			length = MAX;
			return length;
		} else {
			return length;
		}
	}

	public void changeWidth(int pwidth) {
		width = checkDimension(pwidth);
	}

	public void changeHeight(int pheight) {
		height = checkDimension(pheight);
	}

	public int readWidth() {
		return width;
	}

	public int readHeight() {
		return height;
	}
	
	public int calculateArea() {
		return height*width;
	}
}
