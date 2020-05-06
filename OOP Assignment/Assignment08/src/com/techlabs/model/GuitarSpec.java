package com.techlabs.model;

public class GuitarSpec {
	private Builder builder;
	private String model;
	private Wood backWood, topWood;
	private Type type;
	private int numStrings;

	public GuitarSpec(Builder builder, String model, Type type, Wood bW, Wood tW, int numStrings) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = bW;
		this.topWood = tW;
		this.numStrings = numStrings;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public int getNumStrings() {
		return numStrings;
	}
}
