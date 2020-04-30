package com.techlabs.model;

import java.util.ArrayList;
import java.util.Iterator;

public class CrudUsingArrayList implements ICrudable {

	ArrayList<Integer> arrlist = new ArrayList<Integer>();

	@Override

	public void create(int element) {
		arrlist.add(element);
		read();
	}

	public void create(int index, int element) {
		arrlist.add(index, element);
		read();

	}

	public void create(int[] a) {
		for (int i = 0; i < a.length; i++) {
			create(a[i]);
		}
	}

	@Override
	public void read() {
		System.out.println(arrlist);
		System.out.println();
	}

	@Override
	public void update(int index, int element) {
		arrlist.set(index, element);
		read();

	}

	@Override
	public void delete(int index) {
		arrlist.remove(index);
		read();
	}

	@Override
	public void search(int element) {
		if (arrlist.contains(element)) {
			System.out.println("Element:" + element + " is Present");
		} else {
			System.out.println("Element is not found");
		}
	}

}
