package com.techlabs.model;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloFrame implements ActionListener {
	final TextField textfield;

	public HelloFrame(String name) {
		JFrame frame = new JFrame(name);
		textfield = new TextField();
		textfield.setBounds(50, 50, 200, 50);
		frame.setVisible(true);
		frame.setSize(1000, 500);
		JPanel panel = new JPanel();
		JButton button1 = new JButton();
		button1.addActionListener(this);
		JButton button2 = new JButton();
		button2.addActionListener(this);
//		button1.setBounds(300, 50, 50, 50);
//		button1.setBounds(300, 200, 50, 50);
		button1.setText("OK");
		button2.setText("Bye");
		panel.setLayout(new FlowLayout());
		panel.add(button1);
		panel.add(button2);
		panel.add(textfield);
		panel.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.setBackground(Color.blue);
		frame.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		textfield.setText("Welcome to java!!!");
	}
}
