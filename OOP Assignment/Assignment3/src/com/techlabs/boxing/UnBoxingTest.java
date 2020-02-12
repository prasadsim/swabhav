package com.techlabs.boxing;

public class UnBoxingTest {
	public static void main(String args[]) {
		Integer objInt = new Integer("1000");
		int integerValue = objInt.intValue(); // Converting Integer Object into primitive datatype
		System.out.println("Integer Object:" + objInt);
		System.out.println("Primitive Datatype of int:" + integerValue);
		System.out.println();
		Character objChar = new Character('A');
		char charValue = objChar.charValue();
		System.out.println("Character Object:" + objChar);
		System.out.println("Character Value:" + charValue);

	}
}
