package com.techlabs.model.test;

import com.techlabs.model.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InventoryJunitTest {

	@Test
	void test_BuilderOfGuitar() {
		// Arrange
		Inventory i = new Inventory();
		initializeInventory(i);
		// Act
		Builder exceptedBuilder = Builder.FENDER;
		Guitar guitar = i.getGuitar("46AB");
		Builder actualBuilder = guitar.getSpec().getBuilder();
		// Assert
		assertEquals(exceptedBuilder, actualBuilder);
	}

	void test_TypeOfGuitar() {
		// Arrange
		Inventory i = new Inventory();
		initializeInventory(i);
		// Act
		Type exceptedType = Type.ELECTRIC;
		Guitar guitar = i.getGuitar("46AB");
		Type actualType = guitar.getSpec().getType();
		// Assert
		assertEquals(exceptedType, actualType);
	}

	void test_WoodOfGuitar() {
		// Arrange
		Inventory i = new Inventory();
		initializeInventory(i);
		// Act
		Wood exceptedWood = Wood.ALDER;
		Guitar guitar = i.getGuitar("46AB");
		Wood actualWood = guitar.getSpec().getBackWood();
		// Assert
		assertEquals(exceptedWood, actualWood);
	}

	void test_NoOfStringsOfGuitar() {
		// Arrange
		Inventory i = new Inventory();
		initializeInventory(i);
		// Act
		int exceptedNoOfStrings = 12;
		Guitar guitar = i.getGuitar("46AB");
		int actualNoOfStrings = guitar.getSpec().getNumStrings();
		// Assert
		assertEquals(exceptedNoOfStrings, actualNoOfStrings);
	}

	void test_ModelOfGuitar() {
		// Arrange
		Inventory i = new Inventory();
		initializeInventory(i);
		// Act
		String exceptedModel = "Stratocastor";
		Guitar guitar = i.getGuitar("46AB");
		String actualModel = guitar.getSpec().getModel();
		// Assert
		assertEquals(exceptedModel, actualModel);
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("46AB", 5000,
				new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12));
	}

}
