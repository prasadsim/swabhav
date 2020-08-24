package com.techlabs.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFrame extends JFrame {
	public MainFrame() {
		super("Swabhav");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLayout(null);
		JButton helloBtn = new JButton("Hello");
		JButton printBtn = new JButton("Print");
		helloBtn.setBounds(100, 100, 100, 50);
		printBtn.setBounds(200, 100, 100, 50);

		this.add(helloBtn);
		this.add(printBtn);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		helloBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "hello");
			}
		});

		printBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PrintThread t = new PrintThread();
				t.start();
			}
		});

	}
}
