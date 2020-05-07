package com.techlabs.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;

public class CrudUsingTreeMap {

	TreeMap<Integer, String> tmap = new TreeMap();

	public void create(int key, String value) throws KeyAlreadyPresentException {
		if (tmap.containsKey(key)) {
			throw new KeyAlreadyPresentException("Key Already Present in TreeMap!");
		} else {
			tmap.put(key, value);
		}
	}

	public void read() {
		System.out.println(tmap);
	}

	public void delete(int key) {
		System.out.println("Delete Key:" + key + " Value:" + tmap.get(key));
		tmap.remove(key);
		read();
	}

	public void update(int key, String value) {
		tmap.replace(key, value);
		read();
	}

	public void search(int key) {
		if (tmap.containsKey(key)) {
			String a = tmap.get(key);
			System.out.println("Key:" + key + " is present with value:" + a);
		} else {
			System.out.println("Key is not present!");
		}
		read();
	}

	public void treeMapSort() {
		List<Entry<Integer, String>> list = new LinkedList<Entry<Integer, String>>(tmap.entrySet());
		Collections.sort(list, new KeyComparator());
		System.out.println("\nSort by Key:");
		System.out.println(list);

		Collections.sort(list, new ValueComparator());
		System.out.println("\nSort by Value:");
		System.out.println(list);
	}
}
