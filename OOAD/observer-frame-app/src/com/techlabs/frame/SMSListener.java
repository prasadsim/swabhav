package com.techlabs.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SMSListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("SMS notification of order sent");

	}

}
