package com.techlabs.model;

import java.util.Random;

public class Game {
	public int randomNo;
	public int guessNo;
	public int guessMade = 0;

	public void generateRandom() {
		Random rn = new Random();
		randomNo = rn.nextInt(100);
	}

	public void guessNo(Integer guessNo) {
		this.guessNo = guessNo;
	}

	public int checkGuessMade() {
		incrementGuessMade();
		if (guessNo == randomNo) {
			return 1;
		}

		if (guessNo < randomNo) {
			return 2;
		}

		if (guessNo > randomNo) {
			return 3;
		}
		return 0;
	}

	public void incrementGuessMade() {
		guessMade++;
	}

	public void resetGuessMade() {
		guessMade = 0;
	}
	public int getGuessCount() {
		return guessMade;
	}

	public int getGuessMade() {
		return guessNo;
	}
	public int getRandomNo() {
		return randomNo;
	}
}
