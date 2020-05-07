package com.techlabs.model;

import java.util.Comparator;
import java.util.Map.Entry;

public class KeyComparator implements Comparator<Entry<Integer, String>> {

	@Override
	public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
		return o1.getKey().compareTo(o2.getKey());
	}
}
