package ocp.solution1.test;

import ocp.solution1.*;

public class FixedDepositTest {
	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit(1001, "ASH", 50000, 4, new FestivalDiwali());
		System.out.println("TotalInterest:" + fd.calculateTotalInterest());
	}
}
