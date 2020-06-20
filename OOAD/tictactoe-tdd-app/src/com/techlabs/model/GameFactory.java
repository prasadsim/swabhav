package com.techlabs.model;

public class GameFactory {

	private static GameFactory instance;
	private Board board;
	private ResultAnalyzer status;
	private Player p1, p2;
	private Player[] p = new Player[2];
	private Game game;

	private GameFactory() {
	}

	public static GameFactory getInstance() {
		if (instance == null) {
			instance = new GameFactory();
		}
		return instance;
	}

	public void setPlayers(String s1, String s2) {
		this.p1 = new Player(s1, Mark.X);
		this.p2 = new Player(s2, Mark.O);
		initializeGame();
	}

	private void initializeGame() {
		this.board = new Board();
		this.status = new ResultAnalyzer(this.board);
		this.p[0] = p1;
		this.p[1] = p2;
		this.game = new Game(status, board, p);
	}

	public Game getGame() {
		return game;
	}

}
