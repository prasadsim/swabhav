package com.techlabs.model;

import java.util.*;

public class Inventory {

	private List guitars;

	public Inventory() {
		guitars = new LinkedList();
	}

	public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
		Guitar guitar = new Guitar(serialNumber, price, spec);
		guitars.add(guitar);
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	public List search(GuitarSpec searchSpec) {

		List matchingGuitars = new LinkedList();

		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			GuitarSpec guitarSpec = guitar.getSpec();
			if (searchSpec.getBuilder() != guitarSpec.getBuilder())
				continue;
			String model = searchSpec.getModel();

			if ((model != null) && (!model.equals("")) && (!model.equals(guitarSpec.getModel())))
				continue;
			if (searchSpec.getType() != guitarSpec.getType())
				continue;
			if (searchSpec.getBackWood() != guitarSpec.getBackWood())
				continue;
			if (searchSpec.getTopWood() != guitarSpec.getTopWood())
				continue;
			if (searchSpec.getNumStrings() != guitarSpec.getNumStrings())
				continue;
			matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}
}
