package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.*;

class GameTest {

	Board board = new Board();
	ResultAnalyzer status = new ResultAnalyzer(board);
	Player p1 = new Player("Ash", Mark.O);
	Player p2 = new Player("Sim", Mark.X);

	Player[] p = { p1, p2 };

	Game game = new Game(status, board, p);

	@Test
	void test_currentPlayerMark() {
		assertEquals(p1.getMark(), game.getCurrentPlayer().getMark());
	}

	@Test
	void test_nextPlayerMark() {
		assertEquals(p2.getMark(), game.getNextPlayer().getMark());
	}

	@Test
	void test_currentPlayerMarkAfterSwap() {
		game.play(1);
		assertEquals(p2.getMark(), game.getCurrentPlayer().getMark());
	}

	@Test
	void test_nextPlayerMarkAfterSwap() {
		game.play(1);
		assertEquals(p1.getMark(), game.getNextPlayer().getMark());
	}

	@Test
	void test_WinningCondition() {
		game.play(1);
		game.play(7);
		game.play(2);
		game.play(8);
		game.play(3);
		assertEquals("win", game.getStatus().analyzeResult());
	}
}
