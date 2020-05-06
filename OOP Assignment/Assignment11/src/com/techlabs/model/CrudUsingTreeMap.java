package com.techlabs.model;

import java.util.TreeMap;

public class CrudUsingTreeMap {

	TreeMap<Integer, String> tmap = new TreeMap();

	public void create(int key, String value) throws KeyAlreadyPresentException {
		if (tmap.containsKey(key)) {
			throw new KeyAlreadyPresentException("Key Already Present in HashMap!");
		} else {
			tmap.put(key, value);
		}
		read();
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
}
