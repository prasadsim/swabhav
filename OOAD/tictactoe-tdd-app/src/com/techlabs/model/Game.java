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
		if (status.analyzeResult() == "progress") {
			Player temp = this.currentPlayer;
			this.currentPlayer = this.nextPlayer;
			this.nextPlayer = temp;
		}
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
