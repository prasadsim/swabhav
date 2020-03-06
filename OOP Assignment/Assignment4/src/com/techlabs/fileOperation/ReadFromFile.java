package com.techlabs.fileOperation;

import java.io.*;

public class ReadFromFile {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\prasa\\OneDrive\\Desktop\\swabhav\\swabhav_repo\\Ash.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();
	}
}