package com.techlabs.model.test;

import com.techlabs.model.GlassHouse;
import com.techlabs.model.House;
import com.techlabs.model.WoodenHouse;

public class TDPTest {
	public static void main(String[] args) {
		House glassHouse = new GlassHouse();
		glassHouse.buildHouse();
		System.out.println("\n*****************\n");
		House woodenHouse = new WoodenHouse();
		woodenHouse.buildHouse();
	}

}
