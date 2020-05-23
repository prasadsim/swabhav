package ocp.voilation;

public class FixedDeposit {
	private int accno;
	private String name;
	private double amount;
	private int duration;
	private FestivalType festival;
	private double rate;

	public FixedDeposit(int accno, String name, double amount, int duration, FestivalType festival) {
		this.accno = accno;
		this.name = name;
		this.amount = amount;
		this.duration = duration;
		this.festival = festival;
	}

	public double calcualteRate() {
		if (this.festival == FestivalType.RAMZAN) {
			this.rate = 4;
		} else if (this.festival == FestivalType.DIWALI) {
			this.rate = 6;
		} else
			this.rate = 7;
		return rate;
	}

	public double calculateTotalInterest() {
		double interest = 0;
		interest = (this.amount * this.duration * this.rate) / 100;
		return ((this.amount * this.duration * this.rate) / 100);
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

	public FestivalType getFestival() {
		return festival;
	}

}
