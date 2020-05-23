package ocp.voilation.test;

import ocp.voilation.FestivalType;
import ocp.voilation.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit(1001, "ASH", 50000, 10, FestivalType.DIWALI);
		System.out.println("Rate:"+fd.calcualteRate());
		System.out.println("TotalInterest:" + fd.calculateTotalInterest());
	}

}
