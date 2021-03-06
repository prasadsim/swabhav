package com.techlabs.model;

import java.lang.Comparable;

public class LineItem implements Comparable<LineItem> {

	private int id;
	private String name;
	private double price;
	private int quantity;

	public LineItem(int id, String name, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double getCalculateTotal() {
		return this.price * this.quantity;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public int compareTo(LineItem o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		}
		return 1;
	}
}
