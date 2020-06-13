package com.techlabs.model;

public class Game {

	private ResultAnalyzer status;
	private Player currentPlayer;
	private Player nextPlayer;
	private Board board;

	public Game(ResultAnalyzer status, Board board, Player[] players) {
		this.status = status;
		this.board = board;
		this.currentPlayer = players[0];
		this.nextPlayer = players[1];
	}

	public void play(int cellNo) {
		this.board.markCell(cellNo - 1, this.currentPlayer.getMark());
		if (this.status.analyzeResult() == "win") {
			System.out.println("" + this.currentPlayer.getName() + " with Mark:" + this.currentPlayer.getMark()
					+ " won this Game!!!");
			return;
		} else if (this.status.analyzeResult() == "draw") {
			System.out.println("Game is Drawn!!!");
			return;
		}

		Player temp = this.currentPlayer;
		this.currentPlayer = this.nextPlayer;
		this.nextPlayer = temp;
	}

	public ResultAnalyzer getStatus() {
		return status;
	}

	public Player getCurrentPlayer() {
		return this.currentPlayer;

	}

	public Player getNextPlayer() {
		return this.nextPlayer;
	}

	public Board getBoard() {
		return board;
	}

}
