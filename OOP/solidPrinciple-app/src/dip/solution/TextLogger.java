package dip.solution;

public class TextLogger implements ILogger {
	public void log(String errorDetails) {
		System.out.println(errorDetails);
	}
}
