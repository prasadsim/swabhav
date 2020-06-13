package com.techlabs.model;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloFrame {

	public HelloFrame(String name) {
		JFrame frame = new JFrame(name);
		frame.setVisible(true);
		frame.setSize(500, 500);
		JPanel panel = new JPanel();
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		button1.setText("OK");
		button2.setText("Bye");
		panel.setLayout(new FlowLayout());
		panel.add(button1);
		panel.add(button2);
		panel.setAlignmentX(Component.CENTER_ALIGNMENT);	
		panel.setBackground(Color.blue);
		frame.add(panel);
	}
}
