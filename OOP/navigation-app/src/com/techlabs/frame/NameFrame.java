package com.techlabs.frame;

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
		this.panel = new JPanel();
		this.tf = new TextField();
		this.label = new Label("Name");
		this.setVisible(true);
		this.setSize(500, 500);
		this.panel.add(label);
		this.panel.add(tf);
		this.panel.add(button);
		this.add(panel);
		button.addActionListener(new WelcomeFrame(this));
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
