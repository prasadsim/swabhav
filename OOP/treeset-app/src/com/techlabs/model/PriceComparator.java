package com.techlabs.model;

import com.techlabs.model.*;
import java.util.Comparator;
import java.util.TreeSet;

public class PriceComparator implements Comparator<LineItem> {

	@Override
	public int compare(LineItem o1, LineItem o2) {
		if (o1.getPrice() > o2.getPrice()) {
			return 1;
		} else if (o1.getPrice() < o2.getPrice()) {
			return -1;
		}
		return 0;
	}

}
