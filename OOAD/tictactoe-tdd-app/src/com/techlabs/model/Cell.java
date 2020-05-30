package com.techlabs.model;

public class Cell {

	private Mark m = Mark.EMPTY;

	public void setMark(Mark m) {
//		if (this.m == Mark.X || this.m == Mark.O) {
//			throw new RuntimeException("Already Marked!");
//	}
		if (!(this.m == Mark.EMPTY)) {
			throw new RuntimeException("Already Marked!");
		}
		this.m = m;
	}

	public Mark getMark() {
		return m;
	}
}
