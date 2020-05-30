package dip.solution.test;

import dip.solution.*;

public class Test {

	public static void main(String[] args) {
		TaxCalculator cal = new TaxCalculator(new TextLogger());
		System.out.println(cal.calculateTax(10, 5));
		System.out.println(cal.calculateTax(0, 0));
	}

}
