package com.techlabs.model.test;

import com.techlabs.model.*;

public class Test {

	public static void main(String[] args) {
		ResultAnalyzer r = new ResultAnalyzer(new Board());
		r.getBoard().markCell(0, Mark.X);
		r.getBoard().markCell(4, Mark.X);
		r.getBoard().markCell(8, Mark.X);
//		r.getBoard().markCell(8, Mark.X);

//		for (int i = 0; i < 2; i++) {
////			System.out.println(i + 1 + "-" + r.getBoard().getCell(i).getMark());
//			r.getBoard().markCell(i, Mark.O);
//		}
		for (int i = 0; i < 9; i++) {
//			r.getBoard().markCell(i, Mark.O);

			System.out.println(i + 1 + "-" + r.getBoard().getCell(i).getMark());
//		r.getBoard().markCell(i, Mark.O);
		}

		System.out.println(r.getBoard().isBoardFull());

		System.out.println(r.analyzeResult());

	}

}
