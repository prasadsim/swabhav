package com.techlabs.model;

import java.util.Comparator;

public class QuantityComparator implements Comparator<LineItem> {

	@Override
	public int compare(LineItem o1, LineItem o2) {
		if (o1.getQuantity() > o2.getQuantity()) {
			return 1;
		} else if (o1.getQuantity() < o2.getQuantity()) {
			return -1;
		}
		return 0;
	}
}
