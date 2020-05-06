package com.techlabs.model;

import java.util.*;

public class CrudUsingHashMap {

	HashMap<Integer, String> hmap = new HashMap<>();

	public void create(int key, String value) throws KeyAlreadyPresentException {
		if (hmap.containsKey(key)) {
			throw new KeyAlreadyPresentException("Key Already Present in HashMap!");
		} else {
			hmap.put(key, value);
		}
	}

	public void read() {
		System.out.println(hmap);
	}

	public void delete(int key) {
		System.out.println("Delete Key:" + key + " Value:" + hmap.get(key));
		hmap.remove(key);
		read();
	}

	public void update(int key, String value) {
		hmap.replace(key, value);
		read();
	}

	public void search(int key) {
		if (hmap.containsKey(key)) {
			String a = hmap.get(key);
			System.out.println("Key:" + key + " is present with value:" + a);
		} else {
			System.out.println("Key is not present!");
		}
		read();
	}
}
