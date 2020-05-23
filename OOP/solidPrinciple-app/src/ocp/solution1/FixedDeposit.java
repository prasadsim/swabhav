package ocp.solution1;

public class FixedDeposit {
	private int accno;
	private String name;
	private double amount;
	private int duration;
	private IFestival festivalRate;

	public FixedDeposit(int accno, String name, double amount, int duration, IFestival festivalRate) {
		this.accno = accno;
		this.name = name;
		this.amount = amount;
		this.duration = duration;
		this.festivalRate = festivalRate;
	}

	public IFestival getFestival() {
		return festivalRate;
	}

	public double calculateTotalInterest() {
		return ((this.amount * this.duration * this.festivalRate.getRate()) / 100);
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
