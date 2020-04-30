package com.techlabs.model.test;

import com.techlabs.model.CrudUsingHashSet;

public class CrudUsingHashSetTest {

	public static void main(String[] args) {

		CrudUsingHashSet obj=new CrudUsingHashSet();
		int[] elements= {1,2,3,4,5};
		obj.create(elements);
		obj.delete(5);
		obj.search(2);
		obj.update(1, 54);
		
	}

}
