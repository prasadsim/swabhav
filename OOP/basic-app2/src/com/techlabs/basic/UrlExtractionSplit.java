package com.techlabs.basic;

public class UrlExtractionSplit {
	public static void main(String[] args) {
		String str = "https://www.swabhavtechlabs.com?developer=prasad@role=java";
		String[] value = str.split("[@&?$+-]+");
		System.out.println("Company: " +value[0].split("[.]+"));
//		for(String a : value) {
//			System.out.println(a);
//		}
//		System.out.println(value[1]);
	}
}