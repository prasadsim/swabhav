package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Board;
import com.techlabs.model.Mark;

class BoardTest {

	Board b = new Board();

	@Test
	void sizeOfBoardest() {
		assertEquals(9, b.getCells().length);
	}

	void setCellWithinBoard() {
		b.markCell(0, Mark.X);
		assertEquals(Mark.X, b.getCell(0).getMark());
	}

}
