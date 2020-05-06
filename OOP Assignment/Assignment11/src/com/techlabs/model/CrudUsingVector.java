package com.techlabs.model;

import java.util.Vector;

public class CrudUsingVector {
	Vector v = new Vector();

	public void create(String element) {
		v.add(element);
	}

	public void create(int element) {
		v.add(element);
	}

	public void create(char element) {
		v.add(element);
	}

	public void read() {
		System.out.println(v);
	}

	public void delete(String element) {
		v.remove(element);
		read();
	}

	public void delete(int element) {
//		v.remove(element);
		v.remove(element);
		read();
	}

	public void delete(char element) {
		v.remove(element);
		read();
	}

	public void search(String element) {
		if (v.contains(element)) {
			System.out.println("Element:" + element + " is found");
		} else {
			System.out.println("Element:" + element + " is not found");
		}
	}

	public void search(int element) {
		if (v.contains(element)) {
			System.out.println("Element:" + element + " is found");
		} else {
			System.out.println("Element:" + element + " is not found");
		}
	}

	public void search(char element) {
		if (v.contains(element)) {
			System.out.println("Element:" + element + " is found");
		} else {
			System.out.println("Element:" + element + " is not found");
		}
	}
}
