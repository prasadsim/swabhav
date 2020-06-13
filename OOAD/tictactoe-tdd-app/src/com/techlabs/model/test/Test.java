package com.techlabs.model.test;

import com.techlabs.model.*;

public class Test {

	public static void main(String[] args) {
		Board board = new Board();
		ResultAnalyzer status = new ResultAnalyzer(board);
		Player p1 = new Player("Ash",Mark.O);
		Player p2 = new Player("Sim",Mark.X);
		
		Player[] p= {p1,p2};
		
		Game game = new Game(status,board,p);
		
		game.play(1);
		game.play(7);
		game.play(2);
		game.play(8);
		game.play(3);
		
		
	}

}
