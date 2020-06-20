package com.techlabs.client;

import java.util.Scanner;

import com.techlabs.model.Game;
import com.techlabs.model.GameFactory;

public class Test {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		GameFactory factory = GameFactory.getInstance();
		System.out.print("Enter name of Player1:");
		String s1 = s.next();
		System.out.print("Enter name of Player2:");
		String s2 = s.next();
		factory.setPlayers(s1, s2);
		Game game = factory.getGame();

		while (game.getStatus().analyzeResult() == "progress") {
			System.out.print("\n" + game.getCurrentPlayer().getName().toUpperCase() + " enter the cell position:");
			game.play(s.nextInt());
		}

		if (game.getStatus().analyzeResult() == "win") {
			System.out.print("\n" + game.getNextPlayer().getName().toUpperCase() + " won this match!");
		} else if (game.getStatus().analyzeResult() == "draw") {
			System.out.println("\nThis match is Draw!");
		}
	}

}
