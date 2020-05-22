package com.techlabs.model;

public class GlassHouse extends House {

	@Override
	protected void buildWalls() {
		System.out.println("Building Glass Walls!");
	}

	@Override
	protected void buildPillars() {
		System.out.println("Building Pillars with Glass Coating!");
	}

}
