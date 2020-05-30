package com.techlabs.model;

public class Board {

	private Cell[] cells;

	public Board() {
		cells = new Cell[9];
		for (int i = 0; i < 9; i++) {
			cells[i] = new Cell();
		}
	}

	public boolean isBoardFull() {
		for (Cell cell : cells) {
			if (cell.getMark() == Mark.EMPTY) {
				return false;
			}
		}
		return true;
	}

	public void markCell(int cellNo, Mark m) {
		cells[cellNo].setMark(m);
	}

	public Cell[] getCells() {
		return cells;
	}

	public Cell getCell(int cellNo) {
		return cells[cellNo];
	}

}
