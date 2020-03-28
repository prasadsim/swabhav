package com.techlabs.model.test;

import com.techlabs.model.Ash;
import java.util.*;

public class AshTest {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of input:");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			getInfo();
		}
		
		

	}

	private static void getInfo() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the id,name,salary:");
		int id = s.nextInt();
		String name = s.next();
		double salary = s.nextDouble();
	}

}
