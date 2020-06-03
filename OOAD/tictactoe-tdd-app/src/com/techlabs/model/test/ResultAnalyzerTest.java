package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.model.*;

class ResultAnalyzerTest {

	ResultAnalyzer analyzer = new ResultAnalyzer(new Board());

	@Test
	void checkIfWinnerIsOccuredInRow() {
		analyzer.getBoard().markCell(0, Mark.O);
		analyzer.getBoard().markCell(1, Mark.O);
		analyzer.getBoard().markCell(2, Mark.O);

		assertEquals("win", analyzer.analyzeResult());
	}

	void checkIfWinnerIsOccuredInDai() {
		analyzer.getBoard().markCell(0, Mark.O);
		analyzer.getBoard().markCell(4, Mark.O);
		analyzer.getBoard().markCell(8, Mark.O);

		assertEquals("win", analyzer.analyzeResult());
	}

	void checkIfWinnerIsOccuredInCol() {
		analyzer.getBoard().markCell(0, Mark.O);
		analyzer.getBoard().markCell(3, Mark.O);
		analyzer.getBoard().markCell(6, Mark.O);

		assertEquals("win", analyzer.analyzeResult());
	}

	void checkIfProgressIsOccured() {
		analyzer.getBoard().markCell(0, Mark.O);
		analyzer.getBoard().markCell(8, Mark.O);
		analyzer.getBoard().markCell(6, Mark.O);

		assertEquals("progress", analyzer.analyzeResult());
	}

}
