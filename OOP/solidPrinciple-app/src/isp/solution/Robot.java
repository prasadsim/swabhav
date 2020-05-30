package isp.solution;

public class Robot implements IArtificialWorker {

	@Override
	public void startWork() {
		System.out.println("Robot is working");

	}

	@Override
	public void stopWork() {
		System.out.println("Robot stop working");

	}

}
