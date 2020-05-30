package dip.solution;

public class JSONLogger implements ILogger {

	@Override
	public void log(String errorDetails) {
		System.out.println(errorDetails);
	}

}
