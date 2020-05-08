package com.gfs.board;

import java.util.LinkedList;
import java.util.List;

import com.gfs.unit.Unit;

public class Tile {

	private List units;

	public Tile() {
		units = new LinkedList();
	}

	protected void addUnit(Unit unit) {
		units.add(unit);
	}

	protected void removeUnit(Unit unit) {
		units.remove(unit);
	}

	public List getUnits() {
		return units;
	}

	protected void removeUnits() {

	}

}
