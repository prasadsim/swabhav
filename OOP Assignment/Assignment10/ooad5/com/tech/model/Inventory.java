package com.tech.model;

import java.util.*;

public class Inventory {

	private List inventory;

	public Inventory() {
		inventory = new LinkedList();
	}

	public void addInstrument(String serialNo, double price, InstrumentSpec spec) {
		Instrument instrument = new Instrument(serialNo, price, spec);
		inventory.add(instrument);
	}

	public Instrument get(String serialNo) {
		for (Iterator i = inventory.iterator(); i.hasNext();) {
			Instrument instrument = (Instrument) i.next();
			if (instrument.getSerialNumber().equals(serialNo)) {
				return instrument;
			}
		}
		return null;
	}

	public List search(InstrumentSpec searchSpec) {
		List matchingInstruments = new LinkedList();
		for (Iterator i = inventory.iterator(); i.hasNext();) {
			Instrument instrument = (Instrument) i.next();
			if (instrument.getSpec().matches(searchSpec))
				matchingInstruments.add(instrument);
		}
		return matchingInstruments;
	}
}
