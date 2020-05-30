package dip.solution;

public class TaxCalculator {
	private ILogger log;

	public TaxCalculator(ILogger log) {
		this.log = log;
	}

	public int calculateTax(int amt, int rate) {

		try {
			int result = amt / rate;
			return result;
		} catch (Exception e) {
			log.log("Error occured and logged in " + log.getClass().getSimpleName());
			return -1;
		}
	}

}
