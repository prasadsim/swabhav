package com.techlabs.model;

public class Rectangle {
	private int height;
	private int width;

	public void changeWidth(int pwidth) {
		width = pwidth;
		if (width < 1) {
			width = 1;
		} else if (width > 100) {
			width = 100;
		} else {
			width = pwidth;
		}
	}

	public void changeHeight(int pheight) {
		height = pheight;
		if (height > 100) {
			height = 100;
		} else if (height < 1) {
			height = 1;
		} else {
			height = pheight;
		}
	}

	public int readWidth() {
		return width;
	}

	public int readHeight() {
		return height;
	}
}
