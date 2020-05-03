package com.techlabs.model;

public class LineItem {

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
	public boolean equals(Object o) {
		LineItem item = (LineItem) o;
		if (this.hashCode() == item.hashCode()) {
			return true;
		}
		return false;
	}

}
