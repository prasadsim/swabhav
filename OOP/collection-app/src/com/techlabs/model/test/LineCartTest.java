package com.techlabs.model.test;

import java.util.*;
import com.techlabs.model.*;

public class LineCartTest {

	public static void main(String[] args) {
//		case1();
		case2();
	}

	private static void case2() {
		ArrayList<LineItem> cart = new ArrayList();
		cart.add(new LineItem(101, "Book", 10, 500));
		cart.add(new LineItem(102, "Pen", 5, 50));
		cart.add(new LineItem(103, "Pencil", 3, 10));
//		cart.add("Swabhav");

		double totalCartAmount = 0;
		for (LineItem item : cart) {
			System.out.println("Id:" + item.getId() + "\nItemName:" + item.getName() + "\nPrice:" + item.getPrice()
					+ "\nItemQuantity:" + item.getQuantity() + "\nTotal Item Price:" + item.getCalculateTotal() + "\n");
			totalCartAmount = totalCartAmount + item.getCalculateTotal();

		}
		System.out.println("Total Cart Amount:" + totalCartAmount);

	}

	private static void case1() {
		ArrayList cart = new ArrayList();
		cart.add(new LineItem(101, "Book", 10, 500));
		cart.add(new LineItem(102, "Pen", 5, 50));
		cart.add(new LineItem(103, "Pencil", 3, 10));
		cart.add("Swabhav");
		double totalCartAmount = 0;
		for (Object obj : cart) {
			if (obj instanceof LineItem) {
				LineItem item = (LineItem) obj;
				System.out.println("Id:" + item.getId() + "\nItemName:" + item.getName() + "\nPrice:" + item.getPrice()
						+ "\nItemQuantity:" + item.getQuantity() + "\nTotal Item Price:" + item.getCalculateTotal()
						+ "\n");
				totalCartAmount = totalCartAmount + item.getCalculateTotal();
			}
		}
		System.out.println("Total Cart Amount:" + totalCartAmount);
	}
}
