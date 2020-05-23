package ocp.solution;

public class CalculateRate {
	private FestivalType festival;
	private int rate;

	public CalculateRate(FestivalType festival) {
		this.festival = festival;
		if (this.festival == FestivalType.RAMZAN) {
			this.rate = 4;
		} else if (this.festival == FestivalType.DIWALI) {
			this.rate = 6;
		} else
			this.rate = 7;
	}

	public int getRate() {
		return this.rate;
	}

	public FestivalType getFestival() {
		return festival;
	}

}
