package com.techlabs.model;

import java.util.TreeSet;

public class CrudUsingTreeSet {
	TreeSet<Integer> tree = new TreeSet();

	public void create(int element) {
		tree.add(element);
		read();
	}

	public void create(int[] elements) {
		for (int element : elements) {
			create(element);
		}
	}

	public void read() {
		System.out.println(tree);
		System.out.println();
	}

	public void delete(int element) {
		tree.remove(element);
		read();
	}

	public void update(int element1, int element2) {
		if (tree.contains(element1)) {
			tree.remove(element1);
			create(element2);
		}
	}

	public void search(int element) {
		if (tree.contains(element)) {
			System.out.println("Element:" + element + " is found");
		} else {
			System.out.println("Element does not found");
		}
	}
}
