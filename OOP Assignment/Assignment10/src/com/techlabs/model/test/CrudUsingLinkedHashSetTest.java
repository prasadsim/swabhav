package com.techlabs.model.test;

import com.techlabs.model.CrudUsingLinkedHashSet;

public class CrudUsingLinkedHashSetTest {

	public static void main(String[] args) {
		CrudUsingLinkedHashSet obj = new CrudUsingLinkedHashSet();
		int[] elements = { 1154, 284, 32, 4, 5, 5 };
		obj.create(elements);
		obj.delete(4);
		obj.search(5);
		obj.update(2, 995);
	}

}
