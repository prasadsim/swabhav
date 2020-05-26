package com.techlabs.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String playerName;
	private String playerCode;
	private List<Integer> positions = new ArrayList<>();

	public Player(String playerName, String playerCode) {
		this.playerName = playerName;
		this.playerCode = playerCode;
	}

	public void addPosition(int pos) {
		positions.add(pos);
	}

	public List getPositions() {
		return positions;
	}

	public String getPlayerName() {
		return playerName;
	}

	public String getPlayerCode() {
		return playerCode;
	}

}
