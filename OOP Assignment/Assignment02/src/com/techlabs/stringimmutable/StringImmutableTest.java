package com.techlabs.stringimmutable;

public class StringImmutableTest {
	public static void main(String[] args) {
		String s="Prasad";
		s.concat(" Sim"); // As String is Immutable it neither Concat
		s.replace("Prasad", "Ash"); // nor It could be replace
		System.out.println(s);
		System.out.println();

		
		String s1 = "Prasad";
		String s2 = s1.concat(" Sim"); // In this case new string is created and old String is concat
		System.out.println(s2);
		System.out.println();

		
		String s3=s2.replace("Prasad", "Ash"); // In this case new String is created and old String is replace
		System.out.println(s3);
		System.out.println();

	}
}
