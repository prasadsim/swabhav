package com.techlabs.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomeFrame extends JFrame implements ActionListener {
	private NameFrame frame;

	public WelcomeFrame(NameFrame frame) {
		super("Clicked");
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.setVisible(true);
		this.setSize(500, 500);
		JLabel label = new JLabel();
		label.setText("Welcome:" + frame.getTf().getText());
		JPanel panel = new JPanel();
		this.add(panel);
		panel.add(label);

	}
}