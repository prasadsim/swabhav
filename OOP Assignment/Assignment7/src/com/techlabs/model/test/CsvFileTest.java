package com.techlabs.model.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileTest {
	public static void main(String[] args) throws IOException {
		String[][] details = new String[10][4];
		int row = 10;
		int column = openFile(details);
		printDetails(details, row, column);
		discountedPrice(details, row, column);

	}

	public static int openFile(String[][] details) throws IOException {
		String forsplit = "";
		int rows = 0;
		String[] product = null;
		BufferedReader br = new BufferedReader(new FileReader("products.csv"));
		while ((forsplit = br.readLine()) != null) {
			product = forsplit.split(",");
			for (int j = 0; j < product.length; j++) {
				details[rows][j] = java.lang.String.valueOf(product[j]);
			}
			rows++;
		}
		return product.length;
	}

	public static void printDetails(String[][] details, int trow, int tcolumn) {
		for (int row = 0; row < trow; row++) {
			if (details[row][1] != null) {
				for (int column = 0; column < tcolumn; column++) {
					if (details[row][column] != null)
						System.out.print(details[row][column] + " ");
				}
				System.out.println();
			}
		}
		System.out.println();
	}

	public static void discountedPrice(String[][] details, int trows, int tcolumn) {
		double sellingPrice = 0;
		System.out.println("After Discount");
		System.out.println("ID   Price");
		for (int row = 1; row < trows; row++) {
			if (details[row][1] != null && details[row][2] != null && details[row][3] != null) {
				for (int column = 0; column < tcolumn; column++) {
					double discount = Double.parseDouble(details[row][2]);
					double price = Double.parseDouble(details[row][3]);
					sellingPrice = discount * price;
				}
				System.out.println(details[row][0] + "  " + sellingPrice);
			}
		}
	}
}