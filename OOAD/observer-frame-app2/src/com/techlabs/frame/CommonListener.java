package com.techlabs.frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommonListener implements ActionListener {
	private MainFrame frame;

	public CommonListener(MainFrame frame) {
		System.out.println("hello");
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == frame.getRed())
			frame.getPanel().setBackground(Color.red);
		else
			frame.getPanel().setBackground(Color.green);
	}

}
