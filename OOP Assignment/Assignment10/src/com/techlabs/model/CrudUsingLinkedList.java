package com.techlabs.model;

import java.util.LinkedList;

import com.techlabs.model.ICrudable;

public class CrudUsingLinkedList implements ICrudable {

	LinkedList<Integer> list = new LinkedList();

	@Override
	public void create(int element) {
		list.add(element);
		read();
	}

	public void create(int[] values) {
		for (int i : values) {
			create(i);
		}
	}

	public void create(int index, int element) {
		list.add(index, element);
		read();
	}

	@Override
	public void read() {
		System.out.println(list);
		System.out.println();
	}

	@Override
	public void update(int index, int element) {
		list.set(index, element);
		read();
	}

	@Override
	public void delete(int index) {
		list.remove(index);
		read();
	}

	@Override
	public void search(int element) {
		if (list.contains(element)) {
			System.out.println("Element:" + element + " is Present");
		} else {
			System.out.println("Element is not found");
		}
	}

}
