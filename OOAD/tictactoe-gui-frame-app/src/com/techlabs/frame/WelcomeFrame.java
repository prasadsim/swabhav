package com.techlabs.frame;

import javax.swing.*;

public class WelcomeFrame extends JFrame {

	JLabel label1, label2;
	JTextField textField1, textField2;
	JButton button;

	public WelcomeFrame() {
		super("Welcome to TicTacToe Game");
		label1 = new JLabel("Player 1 ");
		label1.setBounds(100, 50, 100, 50);

		label2 = new JLabel("Player 2");
		label2.setBounds(100, 100, 100, 50);

		textField1 = new JTextField();
		textField1.setBounds(200, 50, 200, 50);

		textField2 = new JTextField();
		textField2.setBounds(200, 100, 200, 50);

		button = new JButton("Play");
		button.setBounds(200, 250, 100, 50);
		button.addActionListener(new GameFrame(this));

		add(label1);
		add(textField1);
		add(label2);
		add(textField2);
		add(button);

		setLayout(null);
		setVisible(true);
		setSize(500, 500);

	}

	public String getPlayer1Name() {
		return textField1.getText();
	}

	public String getPlayer2Name() {
		return textField2.getText();
	}

}
