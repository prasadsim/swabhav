package com.techlabs.model;

public class ResultAnalyzer2 {

	private Board board;

	public ResultAnalyzer2(Board board) {
		this.board = board;
	}

	public Board getBoard() {
		return board;
	}

	public String analyzeResult() {
		if (checkRow()) {
			return "Winnerinrow";
		} else if (checkCol()) {
			return "Winnerincol";
		} else if (checkDaigonal()) {
			return "Winnerindai";
		} else if (board.isBoardFull()) {
			return "Draw";
		}
		return "Progress";

	}

	private boolean checkRow() {
//		if (this.board.getCell(0).getMark().equals(this.board.getCell(1).getMark())
//				&& this.board.getCell(1).getMark().equals(this.board.getCell(2).getMark())) {
//			return true;
//		} else if (this.board.getCell(3).getMark().equals(this.board.getCell(4).getMark())
//				&& this.board.getCell(4).getMark().equals(this.board.getCell(5).getMark())) {
//			return true;
//		} else if (this.board.getCell(6).getMark().equals(this.board.getCell(7).getMark())
//				&& this.board.getCell(7).getMark().equals(this.board.getCell(8).getMark())) {
//			return true;
//		}
//		return false;

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
//		if (this.board.getCell(0).getMark().equals(this.board.getCell(4).getMark())
//				&& this.board.getCell(4).getMark().equals(this.board.getCell(8).getMark())) {
//			return true;
//		} else if (this.board.getCell(2).getMark().equals(this.board.getCell(4).getMark())
//				&& this.board.getCell(4).getMark().equals(this.board.getCell(6).getMark())) {
//			return true;
//		}
//		return false;
		if (check(0, 4, 8) == true) {
			return true;
		} else if (check(2, 4, 6) == true) {
			return true;
		}
		return false;
	}

	private boolean checkCol() {
//		if (this.board.getCell(0).getMark().equals(this.board.getCell(3).getMark())
//				&& this.board.getCell(3).getMark().equals(this.board.getCell(6).getMark())) {
//			return true;
//		} else if (this.board.getCell(1).getMark().equals(this.board.getCell(4).getMark())
//				&& this.board.getCell(4).getMark().equals(this.board.getCell(7).getMark())) {
//			return true;
//		} else if (this.board.getCell(2).getMark().equals(this.board.getCell(5).getMark())
//				&& this.board.getCell(5).getMark().equals(this.board.getCell(8).getMark())) {
//			return true;
//		}
//		return false;  
//		this.board.getCell(c1).getMark().equals(this.board.getCell(c2).getMark())
//		&& this.board.getCell(c2).getMark().equals(this.board.getCell(c3).getMark())
//		&&
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
