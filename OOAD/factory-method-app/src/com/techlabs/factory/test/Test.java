package com.techlabs.factory.test;

import com.techlabs.factory.*;

public class Test {

	public static void main(String[] args) {
		IAutoFactory factory = TeslaFactory.getInstance();
		System.out.println(factory.getClass().getSimpleName());
		IAuto auto = factory.make();
		auto.start();
		auto.stop();
	}
}
