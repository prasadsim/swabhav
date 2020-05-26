package com.techlabs.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {
	private List<Integer> boardPos = new ArrayList<>();
	private Scanner s = new Scanner(System.in);
	private static String board[][] = new String[3][3];
	private boolean endGame = false;
	private int position;
	private Player p1, p2;

	public void start() {
		System.out.println("WELCOME TO TIC-TAC-TOE GAME\n\n---------------------------\n");
		System.out.print("Enter the Name of Player1:");
		p1 = new Player(s.nextLine(), "X");
		System.out.print("\nEnter the Name of Player2:");
		p2 = new Player(s.nextLine(), "O");
		initializeBoard();
		displayBoard();
		while (!endGame == true) {
			System.out.print("\n" + p1.getPlayerName().toUpperCase() + " enter the cell no.:");
			this.position = s.nextInt();
			insertValueIntoBoard(p1, position);

			if (!endGame == true) {
				System.out.print("\n" + p2.getPlayerName().toUpperCase() + " enter the cell no.:");
				this.position = s.nextInt();
				insertValueIntoBoard(p2, position);
			}
		}
		System.exit(0);
	}

	private int checkValidPosition(int position) {
		while (position < 1 || position > 9) {
			System.out.print("\nPlease Enter valid cell no within 9 !-");
			position = s.nextInt();
			System.out.println("\n----------------------------------");
		}
		return position;
	}

	private void checkWinningStatus(Player p) {
		List row1 = Arrays.asList(1, 2, 3);
		List row2 = Arrays.asList(4, 5, 6);
		List row3 = Arrays.asList(7, 8, 9);
		List col1 = Arrays.asList(1, 4, 7);
		List col2 = Arrays.asList(2, 5, 8);
		List col3 = Arrays.asList(3, 6, 9);
		List cross1 = Arrays.asList(1, 5, 9);
		List cross2 = Arrays.asList(3, 5, 7);

		List<List> winnigList = new ArrayList<>();
		winnigList.add(row1);
		winnigList.add(row2);
		winnigList.add(row3);
		winnigList.add(col1);
		winnigList.add(col2);
		winnigList.add(col3);
		winnigList.add(cross1);
		winnigList.add(cross2);

		for (List l : winnigList) {
			if (p.getPositions().containsAll(l)) {
				this.endGame = true;
				System.out.print("\n*** Winner of this Match is " + p.getPlayerName().toUpperCase() + " with Code "
						+ p.getPlayerCode() + " ***\n");
				break;
			}
		}

	}

	private void insertValueIntoBoard(Player p, int pos) {
		pos = checkValidPosition(pos);
		if (this.boardPos.contains(pos)) {
			System.out.print("\nThis Cell is Occuiped, Enter different CellNo:");
			pos = s.nextInt();
			this.insertValueIntoBoard(p, pos);
			return;
		}
		if (this.boardPos.size() == 8) {
			System.out.println("*** This Game is Draw! ***");
			this.endGame = true;
			return;
		}
		this.boardPos.add(pos);
		p.addPosition(pos);
		switch (pos) {
		case 1:
			board[0][0] = p.getPlayerCode();
			break;
		case 2:
			board[0][1] = p.getPlayerCode();
			break;
		case 3:
			board[0][2] = p.getPlayerCode();
			break;
		case 4:
			board[1][0] = p.getPlayerCode();
			break;
		case 5:
			board[1][1] = p.getPlayerCode();
			break;
		case 6:
			board[1][2] = p.getPlayerCode();
			break;
		case 7:
			board[2][0] = p.getPlayerCode();
			break;
		case 8:
			board[2][1] = p.getPlayerCode();
			break;
		case 9:
			board[2][2] = p.getPlayerCode();
			break;
		default:
			break;
		}
		checkWinningStatus(p);
		displayBoard();
	}

	private void initializeBoard() {
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				count++;
				board[i][j] = "" + count;
			}
		}
	}

	private void displayBoard() {
		System.out.print("\nTicTacToe BOARD\n");
		for (int i = 0; i < 3; i++) {
			System.out.print("-------------\n| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println("-------------");
	}

}
