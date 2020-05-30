package com.gfs.board;

import java.util.ArrayList;
import java.util.List;

import com.gfs.unit.Unit;

public class ThreeDBoard {
	private int width, height, zpos;
	private List<Board> threeDTiles;

	public ThreeDBoard(int widht, int height, int zpos) {
		this.width = widht;
		this.height = height;
		this.zpos = zpos;
		initialize();
	}

	public void initialize() {
		threeDTiles = new ArrayList<Board>(zpos);
		for (int i = 0; i < zpos; i++) {
			threeDTiles.add(i, new Board(height, width));
		}
	}

	public Tile getTile(int x, int y, int z) {
		return (Tile) (((Board) threeDTiles.get(z - 1)).getTile(x - 1, y - 1));
	}

	public void addUnit(Unit unit, int x, int y, int z) {
		Tile tile = ((Board) threeDTiles.get(z)).getTile(x, y);
		tile.addUnit(unit);
	}

	public void removeUnit(Unit unit, int x, int y, int z) {
		Tile tile = ((Board) threeDTiles.get(z)).getTile(x, y);
		tile.removeUnit(unit);
	}

	public void removeUnits(int x, int y, int z) {
		Tile tile = ((Board) threeDTiles.get(z)).getTile(x, y);
		tile.removeUnits();
	}

	public List getUnits(int x, int y, int z) {
		return ((Board) threeDTiles.get(z)).getTile(x, y).getUnits();
	}

}
