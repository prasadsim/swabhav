package com.techlabs.boxing;

public class AutoBoxingTest {
	public static void main(String[] args) {
		Integer result = addNumbers(50, 500);
		Character ch[] = {'a','b','c'};
		displayArrayOfCharacter(ch);
		String combineString = concatString("ASH", " SIM");
		System.out.println("String:\t"+combineString);
		System.out.println("Integer:\t"+result);

	}

	private static int addNumbers(Integer x, Integer y) {
		return (x + y);
	}

	private static void displayArrayOfCharacter(Character[] ch) {
		System.out.print("Character:");
		for (char a : ch) {
			System.out.print("\t"+a);
		}
		System.out.println();
	}

	private static String concatString(String s1, String s2) {
		String s3 = s1.concat(s2);
		return s3;
	}

}
