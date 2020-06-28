package com.techlabs.frame;

import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NameFrame extends JFrame {
	private JPanel panel;
	private JButton button;
	private TextField tf;
	private Label label;

	public NameFrame() {
		super("Swabhav");
		this.button = new JButton("Next");
		button.setBounds(100, 50, 100, 100);
		this.tf = new TextField();
		tf.setBounds(150,10,70,20);
		this.label = new Label("Name");
		label.setBounds(50, 10, 70, 20);
		this.setVisible(true);
		this.setSize(500, 500);
		add(label);
		add(tf);
		add(button);
		button.addActionListener(new WelcomeFrame(this));
		this.setLayout(null);
	}

	public JPanel getPanel() {
		return panel;
	}

	public JButton getButton() {
		return button;
	}

	public TextField getTf() {
		return tf;
	}

	public Label getLabel() {
		return label;
	}

}