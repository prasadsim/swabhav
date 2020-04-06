package com.techlabs.model;

import java.util.Scanner;

public class GameTerminal {
	private int result;
	private final int equals = 1;
	private final int smaller = 2;
	private final int greater = 3;
	private String quit = "No";

	public void startGame() {
		Game newgame = new Game();
		newgame.generateRandom();
		do {
			guessNo(newgame);
			checkGuessNo(newgame);
		} while (this.quit == "No");
	}

	public void guessNo(Game newgame) {
		System.out.println("Guess a Number:");
		Scanner s = new Scanner(System.in);
		newgame.guessNo(s.nextInt());
	}

	public void checkGuessNo(Game newgame) {
		result = newgame.checkGuessMade();
		switch (result) {
		case equals:
			System.out.println("Guess Number is Equal:" + newgame.getGuessMade());
			System.out.println("Total Guess Count:" + newgame.getGuessCount());
			checkUserAnswer();
			newgame.generateRandom();
			newgame.resetGuessMade();
//			System.out.println("Random No:" + newgame.getRandomNumber());
			break;
		case smaller:
			System.out.println("Guess Number is Smaller:" + newgame.getGuessMade());
//			System.out.println("Random No:" + newgame.getRandomNumber());
			break;
		case greater:
			System.out.println("Guess Number is Greater:" + newgame.getGuessMade());
//			System.out.println("Random No:" + newgame.getRandomNumber());
		}
	}

	public void checkUserAnswer() {
		System.out.println("Want to Quit? y or n?");
		Scanner s = new Scanner(System.in);
		String decision = s.next();
		switch (decision) {
		case "y":
			quit = "Yes";
			System.exit(0);
			break;
		case "n":
			quit = "No";
			break;
		}
	}
}
