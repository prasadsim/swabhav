package com.techlabs.boxing;

public class BoxingTest {
	public static void main(String args[]) {
		Integer i = new Integer(5000); // Converting primitive datatype to object is called boxing
		System.out.println(i);

		Character ch = new Character('A');
		System.out.println(ch);

		if (i == 100 || ch == 'A') {
			Boolean b1 = new Boolean(true);
			System.out.println(b1);
		} else {
			Boolean b2 = new Boolean(false);
			System.out.println(b2);
		}

	}
}
