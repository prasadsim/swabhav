package com.techlabs.model.test;

import com.techlabs.model.Boy;
import com.techlabs.model.Man;
import com.techlabs.model.Kid;
import com.techlabs.model.Infant;

public class ManTest {
	public static void main(String[] args) {
		// case1();
		// case2();
//		case3();
//		atThePark(new Man());
//		atThePark(new Boy());
//		atThePark(new Kid());
//		atThePark(new Infant());
		case5();
	}

	private static void case1() {
		Man x;
		x = new Man();
		x.play();
	}

	private static void case2() {
		Boy y;
		y = new Boy();
		y.run();
		y.play();
	}

	private static void case3() {
		Man x;
		x = new Boy();
		x.play();
	}

	private static void atThePark(Man x) {
		System.out.println("At the Park");
		x.play();
		System.out.println();
	}

	private static void case5() {
		Object x;
		x = 10;
		System.out.println(x.getClass());

		x = "Hello";
		System.out.println(x.getClass());

		x = 10 > 20;
		System.out.println(x.getClass());

		x = new Integer(10);
		System.out.println(x.getClass());

	}
}
