package com.techlabs.model.test;

import com.techlabs.model.Game;

import java.util.Scanner;

public class GameTerminal {

	private static void start() {
		int guessNumber;
		Scanner s = new Scanner(System.in);
		Game game = new Game();
		String result = "";
		while (result != "Correct") {
			System.out.println("Enter the Guess:");
			guessNumber = s.nextInt();
			result = game.checkGuess(guessNumber);
			if (result == "Too Low") {
				System.out.println("GuessNumber is Too low!");
			} else if (result == "Too High") {
				System.out.println("GuessNumber is Too High!");
			}
		}
		System.out.println("The Guess Is Correct:" + result);
		System.out.println("Total Guess Made:" + game.getGuessCount());
		System.out.println("Game Score:"+game.getGameScore());
		System.out.println();
		System.out.println("Play Again?");
		menu();
	}

	private static void menu() {
		Scanner s = new Scanner(System.in);
		System.out.println("Press 1. for Start or 2. for End");
		int decision = s.nextInt();
		switch (decision) {
		case 1:
			start();
			break;
		case 2:
			System.exit(0);
			break;
		default:
			System.out.println("Enter proper decision!");
			menu();
			break;
		}
	}

	public static void main(String[] args) {
		start();
	}
}