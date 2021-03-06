package com.techlabs.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Order {

	private UUID id;
	private Date date;
	private List<LineItem> items = new ArrayList<LineItem>();
	SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");

	public Order(UUID id, String date) throws ParseException {
		this.id = id;
		this.date = sdf.parse(date);
	}

	public void addItem(LineItem item) {
		if (this.getItems().contains(item)) {
			this.getItems().get(this.getItems().indexOf(item)).incrementQuantity(item.getQuantity());
		} else {
			items.add(item);
		}
	}

	public double checkoutCost() {
		double totalCost = 0;
		for (LineItem item : items) {
			totalCost = totalCost + item.calculateItemCost();
		}
		return totalCost;
	}

	public UUID getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public List<LineItem> getItems() {
		return items;
	}

}