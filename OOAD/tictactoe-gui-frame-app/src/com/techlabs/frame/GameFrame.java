package com.techlabs.frame;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.techlabs.model.Game;
import com.techlabs.model.GameFactory;

public class GameFrame extends JFrame implements ActionListener {

	WelcomeFrame frame;
	GameFactory factory;
	Game game;
	JLabel status, cp;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;

	public GameFrame(WelcomeFrame frame) {
		super("Game Starts");
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.setSize(700, 700);
		this.setVisible(true);
		this.setLayout(null);

		factory = GameFactory.getInstance();
		factory.setPlayers(frame.getPlayer1Name(), frame.getPlayer2Name());

		game = factory.getGame();

		status = new JLabel();
		status.setText("Status - " + game.getStatus().analyzeResult());
		status.setBounds(300, 30, 200, 50);
		add(status);

		cp = new JLabel();
		cp.setText("CurrentPlayer - " + game.getCurrentPlayer().getName());
		cp.setBounds(300, 50, 200, 50);
		add(cp);

		initializeButtons();
		makeButtonListener();

	}

	private void makeButtonListener() {
		
		b1.addActionListener(new ButtonListener(this, b1, 1));
		b2.addActionListener(new ButtonListener(this, b2, 2));
		b3.addActionListener(new ButtonListener(this, b3, 3));
		b4.addActionListener(new ButtonListener(this, b4, 4));
		b5.addActionListener(new ButtonListener(this, b5, 5));
		b6.addActionListener(new ButtonListener(this, b6, 6));
		b7.addActionListener(new ButtonListener(this, b7, 7));
		b8.addActionListener(new ButtonListener(this, b8, 8));
		b9.addActionListener(new ButtonListener(this, b9, 9));
		
	}

	private void initializeButtons() {

		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");

		b1.setBounds(200, 200, 50, 50);
		b2.setBounds(300, 200, 50, 50);
		b3.setBounds(400, 200, 50, 50);
		b4.setBounds(200, 300, 50, 50);
		b5.setBounds(300, 300, 50, 50);
		b6.setBounds(400, 300, 50, 50);
		b7.setBounds(200, 400, 50, 50);
		b8.setBounds(300, 400, 50, 50);
		b9.setBounds(400, 400, 50, 50);

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);

	}

}
