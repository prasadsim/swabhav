package com.techlabs.model;

public abstract class House {
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
	}

	protected abstract void buildWalls();

	protected abstract void buildPillars();

	public void buildFoundation() {
		System.out.println("Building House Foundation!");
	}

	public void buildWindows() {
		System.out.println("Building House Windows!");
	}

}
