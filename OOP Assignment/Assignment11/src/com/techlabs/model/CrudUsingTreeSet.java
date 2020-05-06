package com.techlabs.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class CrudUsingTreeSet {
	TreeSet<String> tree = new TreeSet();

	public void create(String element) {
		tree.add(element);
//		sort(element);
	}

	public void create(String[] elements) {
		for (String element : elements) {
			create(element);
		}
	}

	public void read() {
		System.out.println(tree);
	}

	public void delete(String element) {
		tree.remove(element);
		read();
	}

	public void update(String element1, String element2) {
		if (tree.contains(element1)) {
			tree.remove(element1);
			create(element2);
		}
	}

	public void search(String element) {
		if (tree.contains(element)) {
			System.out.println("Element:" + element + " is found");
		} else {
			System.out.println("Element does not found");
		}
	}
//
//	public void sort(String element) {
//		ArrayList<String> a = new ArrayList();
//		a.add(element);
//		Collections.sort(a);
//	}

}
