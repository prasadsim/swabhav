package com.techlabs.frame;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrintThread extends Thread{

	public void run() {
		while (true) {
			Calendar now = new GregorianCalendar();
			int h = now.get(Calendar.HOUR);
			int m = now.get(Calendar.MINUTE);
			int s = now.get(Calendar.SECOND);
			System.out.println(h + ":" + m + ":" + s + "");
		}
	}
}
