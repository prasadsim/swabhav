package com.techlabs.model.test;

import java.util.*;
import com.techlabs.model.*;

public class FindGuitarTester {

	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER,
				12);

		List matchingGuitars = inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println("We have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType()
						+ " guitar:\n " + spec.getBackWood() + " back and sides,\n " + spec.getTopWood()
						+ " top\n "+spec.getNumStrings()+" Strings.\n You can have it for only $" + guitar.getPrice() + "!\n ------");

			}
		} else {
			System.out.println("Sorry, Erin, We have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("46AB", 5000,
				new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12));
		inventory.addGuitar("85PD", 4500,
				new GuitarSpec(Builder.GIBSON, "Stratocastor", Type.AUSOCTIC, Wood.ADIRONDACK, Wood.CEDAR, 14));
		inventory.addGuitar("75TY", 8500,
				new GuitarSpec(Builder.OLSON, "Stratocastor", Type.ELECTRIC, Wood.INDIAN_ROSEWOOD, Wood.SITKA, 14));
	}
}
