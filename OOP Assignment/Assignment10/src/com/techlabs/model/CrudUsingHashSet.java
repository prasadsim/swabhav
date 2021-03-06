package com.techlabs.model;

import java.util.HashSet;

public class CrudUsingHashSet {

	HashSet<Integer> hash = new HashSet();

	public void create(int element) {
		hash.add(element);
		read();
	}

	public void create(int[] elements) {
		for (int element : elements) {
			create(element);
		}
	}

	public void read() {
		System.out.println(hash);
		System.out.println();
	}

	public void update(int element1, int element2) {
		if (hash.contains(element1)) {
			hash.remove(element1);
			create(element2);
		}
	}

	public void delete(int element) {
		hash.remove(element);
		read();
	}

	public void search(int element) {

		if (hash.contains(element)) {
			System.out.println("Element:" + element + " is found");
		} else {
			System.out.println("Element:" + element + " is not found");
		}
	}

}
