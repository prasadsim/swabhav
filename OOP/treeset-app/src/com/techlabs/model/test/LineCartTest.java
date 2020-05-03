package com.techlabs.model.test;

import java.util.*;
import com.techlabs.model.*;

public class LineCartTest {

	public static void main(String[] args) {
		case1();
		case2();
		case3();
		case4();
		case5();
	}

	private static void case4() {
		TreeSet<LineItem> items = new TreeSet<LineItem>(new PriceComparator());
		items.add(new LineItem(101, "Book", 10, 500));
		items.add(new LineItem(102, "Pen", 5, 50));
		items.add(new LineItem(103, "Pencil", 3, 10));
		System.out.println("\nSorted using Price");
		for (LineItem item : items) {
			System.out.println("Id:" + item.getId() + "\tName:" + item.getName() + "\tPrice:" + item.getPrice()
					+ "\tQuantity:" + item.getQuantity() + "\tTotalPrice:" + item.getCalculateTotal());
		}
	}

	private static void case3() {
		TreeSet<LineItem> items = new TreeSet<LineItem>(new IdComparator());
		items.add(new LineItem(101, "Book", 10, 500));
		items.add(new LineItem(102, "Pen", 5, 50));
		items.add(new LineItem(103, "Pencil", 3, 10));
		System.out.println("\nSorted using Id");
		for (LineItem item : items) {
			System.out.println("Id:" + item.getId() + "\tName:" + item.getName() + "\tPrice:" + item.getPrice()
					+ "\tQuantity:" + item.getQuantity() + "\tTotalPrice:" + item.getCalculateTotal());
		}
	}

	private static void case5() {
		TreeSet<LineItem> items = new TreeSet<LineItem>(new QuantityComparator());
		items.add(new LineItem(101, "Book", 10, 500));
		items.add(new LineItem(102, "Pen", 5, 50));
		items.add(new LineItem(103, "Pencil", 3, 10));
		System.out.println("\nSorted using Quantity");
		for (LineItem item : items) {
			System.out.println("Id:" + item.getId() + "\tName:" + item.getName() + "\tPrice:" + item.getPrice()
					+ "\tQuantity:" + item.getQuantity() + "\tTotalPrice:" + item.getCalculateTotal());
		}
	}

	private static void case1() {
		TreeSet<String> names = new TreeSet<String>();
		names.add("Swabhav");
		names.add("techlabs");
		names.add("techlabs");
		System.out.println(names.size());
	}

	private static void case2() {
		TreeSet<LineItem> items = new TreeSet<LineItem>();
		items.add(new LineItem(101, "book", 10, 500));
		items.add(new LineItem(101, "p", 103, 500));
		items.add(new LineItem(102, "nd", 140, 500));
		items.add(new LineItem(108, "ds", 115, 500));
		System.out.println(items.size());
	}
}
