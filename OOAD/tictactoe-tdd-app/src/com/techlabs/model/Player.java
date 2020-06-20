package com.techlabs.model;

public class Player {

	private Mark mark;
	private String name;

	public Player(String name, Mark mark) {
		this.mark = mark;
		this.name = name;
	}

	public Mark getMark() {
		return mark;
	}

	public String getName() {
		return name;
	}

}
