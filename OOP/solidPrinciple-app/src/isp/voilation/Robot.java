package isp.voilation;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Robot is working");

	}

	@Override
	public void stopWork() {
		System.out.println("Robot stop working");

	}

	@Override
	public void startEat() {
		throw new RuntimeException("Robot cannot eat");

	}

	@Override
	public void stopEat() {
		throw new RuntimeException("Robot cannot eat");

	}

}
