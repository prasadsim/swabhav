package com.techlabs.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import com.techlabs.model.*;
import com.techlabs.model.test.*;

class GameTerminalJunitTest {
	// Arrange
	Game game = new Game();

	@BeforeClass
	public int setup() {
		int randomNo = game.getGeneratedRandomNumber();
		return randomNo;
	}

	@Test
	void test_ifRandomValueIsLow() {
		// Act
		int lowValue = setup() - 1;
		String actual = game.checkGuess(lowValue);
		String excepted = "Low";
		// Assert
		assertEquals(excepted, actual);
	}

	void test_ifRandomValueIsCorrect() {
		// Act
		int correctValue = setup();
		String actual = game.checkGuess(correctValue);
		String excepted = "Correct";
		// Assert
		assertEquals(excepted, actual);
	}

	void test_ifRandomValueIsHigh() {
		// Act
		int highValue = setup() + 1;
		String actual = game.checkGuess(highValue);
		String excepted = "High";
		// Assert
		assertEquals(excepted, actual);
	}
}
