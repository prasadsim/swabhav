package com.techlabs.model;

import java.util.Comparator;
import java.util.UUID;

public class LineItem {

	private UUID id;
	private int quantity;
	private Product product;

	public LineItem(UUID id, int quantity, Product product) {
		this.id = id;
		this.product = product;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "LineItemDetails!\nId:" + this.id + "\nQuantity:" + this.quantity + "\nItemCost:"
				+ this.calculateItemCost() + "\n\nProductDetails!\nId:" + this.getProduct().getId() + "\nName:"
				+ this.getProduct().getName() + "\nPrice:" + this.getProduct().getPrice() + "\nAfterDiscountCost:"
				+ this.getProduct().totalCost();
	}

	@Override
	public boolean equals(Object o) {
		LineItem item = (LineItem) o;
		if (this.hashCode() == item.hashCode())
			return true;
		return false;
	}

	public double calculateItemCost() {
		return quantity * product.totalCost();
	}

	public UUID getId() {
		return id;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void incrementQuantity(int quantity) {
		this.quantity = this.quantity + quantity;
	}
}