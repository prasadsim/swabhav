package com.techlabs.model;

public class ResultAnalyzer {

	private Board board;

	public ResultAnalyzer(Board board) {
		this.board = board;
	}

	public Board getBoard() {
		return board;
	}

	public String analyzeResult() {
		if (checkRow()) {
			return "win";
		} else if (checkCol()) {
			return "win";
		} else if (checkDaigonal()) {
			return "win";
		} else if (board.isBoardFull()) {
			return "draw";
		}
		return "progress";

	}

	private boolean checkRow() {
		if (check(0, 1, 2) == true) {
			return true;
		} else if (check(3, 4, 5) == true) {
			return true;
		} else if (check(6, 7, 8) == true) {
			return true;
		}
		return false;
	}

	private boolean checkDaigonal() {
		if (check(0, 4, 8) == true) {
			return true;
		} else if (check(2, 4, 6) == true) {
			return true;
		}
		return false;
	}

	private boolean checkCol() {
		if (check(0, 3, 6) == true) {
			return true;
		} else if (check(1, 4, 7) == true) {
			return true;
		} else if (check(2, 5, 8) == true) {
			return true;
		}
		return false;
	}

	private boolean check(int c1, int c2, int c3) {
		if (this.board.getCell(c1).getMark().equals(this.board.getCell(c2).getMark())
				&& this.board.getCell(c2).getMark().equals(this.board.getCell(c3).getMark())) {
			if (this.board.getCell(c1).getMark().equals(Mark.EMPTY)) {
				return false;
			}
			return true;
		}
		return false;
	}
}
