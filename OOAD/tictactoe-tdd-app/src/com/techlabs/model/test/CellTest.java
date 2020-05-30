package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.Cell;
import com.techlabs.model.Mark;

class CellTest {
	Cell c = new Cell();

	@Test
	void initialMarkOfCelltest() {
		assertEquals(Mark.EMPTY, c.getMark());
	}

	void markOfCellAfterSettingToX() {
		c.setMark(Mark.X);
		assertEquals(Mark.X, c.getMark());
	}

	void markOfCellAfterSettingToO() {
		c.setMark(Mark.O);
		assertEquals(Mark.O, c.getMark());
	}

	void markingCellTwiceTest() {
		try {
			c.setMark(Mark.X);
			c.setMark(Mark.O);
		} catch (Exception e) {
			assertEquals("Already Marked!", e.getMessage());
		}
	}

}
