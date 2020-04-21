package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.techlabs.model.*;
import com.techlabs.model.test.*;

class GameTerminalJunitTest {
	// Arrange
	Game game = new Game();

	@Test
	void test_ifRandomValueIsLow() {
		// Act
		int lowValue = game.getGeneratedRandomNumber() - 1;
		String actual = game.checkGuess(lowValue);
		String excepted = "Low";
		// Assert
		assertEquals(excepted, actual);
	}

	void test_ifRandomValueIsCorrect() {
		// Act
		int correctValue = game.getGeneratedRandomNumber();
		String actual = game.checkGuess(correctValue);
		String excepted = "Correct";
		// Assert
		assertEquals(excepted, actual);
	}

	void test_ifRandomValueIsHigh() {
		// Act
		int highValue = game.getGeneratedRandomNumber() + 1;
		String actual = game.checkGuess(highValue);
		String excepted = "High";
		// Assert
		assertEquals(excepted, actual);
	}
}
