package com.techlabs.model;

import java.util.Random;

public class Game {
	private int generatedRandomNo;
	private int guessedNumber;
	private int guessCount = 0;
	private int gameScore = 0;

	public Game() {
		System.out.println("Game has Started");
		this.generatedRandomNo = (int) (100 * Math.random());
	}

	public String checkGuess(int guessedNumber) {
		System.out.println("Game is in Progress");
		gameScore = getGameScore();
		incrementGuessCount();
		if (guessedNumber == generatedRandomNo) {
			resetGuessNumber();
			return "Correct";
		}

		if (guessedNumber < generatedRandomNo) {
			return "Low";

		}

		if (guessedNumber > generatedRandomNo) {
			return "High";
		}
		return "";
	}

	public int getGameScore() {
		int score = 100 - (10 * guessCount);
		if (score > 5) {
			return score;
		}
		return 5;
	}

	private void incrementGuessCount() {
		guessCount++;
	}

	private void resetGuessNumber() {
		guessedNumber = 0;
	}

	public int getGuessCount() {
		System.out.println("Game has Ended");
		return guessCount;
	}
	public int getGeneratedRandomNumber() {
		return generatedRandomNo;
	}
}