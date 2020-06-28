package com.techlabs.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonListener implements ActionListener {

	GameFrame frame;
	JButton b;
	int index;

	public ButtonListener(GameFrame frame, JButton b, int index) {
		this.frame = frame;
		this.b = b;
		this.index = index;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (frame.game.getStatus().analyzeResult() == "progress") {
			frame.cp.setText("CurrentPlayer - " + frame.game.getNextPlayer().getName());
			frame.status.setText("Status - " + frame.game.getStatus().analyzeResult());
			frame.game.play(index);
			b.setText("" + frame.game.getNextPlayer().getMark());
		}
		
		if (frame.game.getStatus().analyzeResult() == "win") {

			frame.status.setText("Status - " + frame.game.getStatus().analyzeResult());
			frame.cp.setText("CurrentPlayer - " + frame.game.getNextPlayer().getName());
		}

		if (frame.game.getStatus().analyzeResult() == "draw") {

			frame.status.setText("Status - " + frame.game.getStatus().analyzeResult());
			frame.cp.setText("Match is Draw");

		}
	}

}
