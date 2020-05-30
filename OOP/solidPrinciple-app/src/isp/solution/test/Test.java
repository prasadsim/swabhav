package isp.solution.test;

import isp.solution.IArtificialWorker;
import isp.solution.IWorker;
import isp.solution.Manager;
import isp.solution.Robot;

public class Test {

	public static void main(String[] args) {
		Manager m = new Manager();
		Robot r = new Robot();

		atCafeteria(m);
//		atCafeteria(r);   coz robot doesn't implements IWorker
		atWorkStation(m);
		atWorkStation(r);
	}

	private static void atCafeteria(IWorker w) {
		w.startEat();
		w.stopEat();
	}

	private static void atWorkStation(IArtificialWorker w) {
		w.startWork();
		w.stopWork();
	}

}
