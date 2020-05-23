package ocp.solution;

public class FixedDeposit {
	private int accno;
	private String name;
	private double amount;
	private int duration;
	private CalculateRate calRate;

	public FixedDeposit(int accno, String name, double amount, int duration, CalculateRate rate) {
		this.accno = accno;
		this.name = name;
		this.amount = amount;
		this.duration = duration;
		this.calRate = rate;
	}

	public CalculateRate getCalRate() {
		return calRate;
	}

	public double calculateTotalInterest() {
		return ((this.amount * this.duration * this.calRate.getRate()) / 100);
	}

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public int getDuration() {
		return duration;
	}

}
