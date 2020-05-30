package dip.voilation.test;

import dip.voilation.LogType;
import dip.voilation.TaxCalculator;

public class Test {
	public static void main(String[] args) {
		TaxCalculator cal = new TaxCalculator(LogType.JSON);
		System.out.println(cal.calculateTax(10, 5));
		System.out.println(cal.calculateTax(0, 0));
	}

}
