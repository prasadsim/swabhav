package com.techlabs.model;

import java.util.*;

public class CrudUsingHashSet {

	HashSet<String> hash = new HashSet();

	public void create(String element) {
		hash.add(element);
	}

	public void create(String[] elements) {
		for (String element : elements) {
			create(element);
		}
	}

	public void read() {
		System.out.println(hash);
	}

	public void update(String element1, String element2) {
		if (hash.contains(element1)) {
			hash.remove(element1);
			create(element2);
		}
	}

	public void delete(String element) {
		hash.remove(element);
		read();
	}

	public void sortHashSet() {
		ArrayList<String> a = new ArrayList(hash);
		Collections.sort(a);
		System.out.println("Collections.sort()\n" + a);
	}

	public void search(String element) {

		if (hash.contains(element)) {
			System.out.println("Element:" + element + " is found");
		} else {
			System.out.println("Element:" + element + " is not found");
		}
	}

}
