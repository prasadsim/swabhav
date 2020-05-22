package com.techlabs.model;

public class WoodenHouse extends House {

	@Override
	protected void buildWalls() {
		System.out.println("Building Wooden Walls!");
	}

	@Override
	protected void buildPillars() {
		System.out.println("Building pillars with Wooden Coating!");
	}

}
