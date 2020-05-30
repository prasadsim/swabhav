package isp.voilation.test;

import isp.voilation.IWorker;
import isp.voilation.Manager;
import isp.voilation.Robot;

public class Test {

	public static void main(String[] args) {
		Manager m = new Manager();
		Robot r = new Robot();
		atCafeteria(m);
		atCafeteria(r);
		atWorkStation(m);
		atWorkStation(r);

	}

	private static void atWorkStation(IWorker w) {
		w.startWork();
		w.stopWork();
	}

	private static void atCafeteria(IWorker w) {
		w.startEat();
		w.stopEat();
	}

}
