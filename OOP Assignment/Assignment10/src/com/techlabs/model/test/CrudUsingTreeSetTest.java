package com.techlabs.model.test;

import com.techlabs.model.CrudUsingTreeSet;

public class CrudUsingTreeSetTest {

	public static void main(String[] args) {

		CrudUsingTreeSet obj = new CrudUsingTreeSet();
		int[] elements = { 5, 8, 4, 3, 8, 6, 5, 4 };
		obj.create(elements);
		obj.delete(4);
		obj.update(3, 84);
		obj.search(5);
	}

}
