package com.techlabs.model.test;

import com.techlabs.model.Singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton obj = Singleton.getInstance();
		obj.showMessage();
	}

}
