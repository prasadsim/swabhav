package ocp.solution.test;

import ocp.solution.CalculateRate;
import ocp.solution.FestivalType;
import ocp.solution.FixedDeposit;

public class FixedDepositTest {
	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit(1001, "ASH", 50000, 10, new CalculateRate(FestivalType.DIWALI));
		System.out.println("Name:" + fd.getName() + "\nAccNo:" + fd.getAccno() + "\nAmount:" + fd.getAmount()
				+ "\nDuration:" + fd.getDuration() + "\nRate:" + fd.getCalRate().getRate() + "\nTotalInterest:"
				+ fd.calculateTotalInterest());

	}
}
