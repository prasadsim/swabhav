package com.techlabs.model;

import java.util.LinkedHashSet;

public class CrudUsingLinkedHashSet {
	LinkedHashSet<Integer> link = new LinkedHashSet();

	public void create(int element) {
		link.add(element);
		read();
	}

	public void create(int[] elements) {
		for (int element : elements) {
			create(element);
		}
	}

	public void read() {
		System.out.println(link);
		System.out.println();
	}

	public void delete(int element) {
		link.remove(element);
		read();
	}

	public void update(int element1, int element2) {
		if (link.contains(element1)) {
			link.remove(element1);
			create(element2);
		}
	}

	public void search(int element) {
		if (link.contains(element)) {
			System.out.println("Element:" + element + " is found");
		} else {
			System.out.println("Element does not found");
		}
	}
}
