package dip.voilation;

public class TaxCalculator {
	private LogType log;

	public TaxCalculator(LogType log) {
		this.log = log;
	}

	public int calculateTax(int amt, int rate) {

		try {
			int result = amt / rate;
			return result;
		} catch (Exception e) {
			if (this.log == LogType.JSON) {
				new JSONLogger().log("Error occured and logged in json logger");
			} else if (this.log == LogType.TXT) {
				new TextLogger().log("Error occured and logged in text logger");
			} else if (this.log == LogType.XML) {
				new XMLLogger().log("Error occured and logged in xml logger");
			}
			return -1;
		}
	}

}
