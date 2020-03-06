package com.techlabs.fileOperation;

import java.util.*;
import java.io.*;

public class WriteFromFile {
	public static void main(String[] args) {
		try {
			File objFile = new File("C:\\Users\\prasa\\OneDrive\\Desktop\\swabhav\\swabhav_repo\\Ash.txt");
			if (objFile.exists() == false) {
				if (objFile.createNewFile()) {
					System.out.println("File created successfully");
					return;
				}
				System.out.println("File creation failed!!");
				System.exit(0);
			}
			String text;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter text to write into file:");
			text = sc.nextLine();
			FileOutputStream fileOut = new FileOutputStream(objFile, true);
			fileOut.write(text.getBytes());
			fileOut.close();
			System.out.println("File saved");
			sc.close();

			// Again read from file//

			System.out.println("\nFile contains:-");
			File f = new File("C:\\Users\\prasa\\OneDrive\\Desktop\\swabhav\\swabhav_repo\\Ash.txt");
			BufferedReader br = new BufferedReader(new FileReader(f));

			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();

		} catch (Exception Ex) {
			System.out.println("Exception : " + Ex.toString());
		}
	}

}
