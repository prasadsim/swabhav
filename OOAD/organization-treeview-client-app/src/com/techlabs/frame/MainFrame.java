package com.techlabs.frame;

import java.io.IOException;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import com.techlabs.model.Employee;
import com.techlabs.model.EmployeeDataAnalyzer;
import com.techlabs.model.FileLoader;
import com.techlabs.model.OrgHierarchyBuilder;

public class MainFrame extends JFrame {
	JLabel title;

	public MainFrame() throws ParseException, IOException {
		super("Swabhav");

		title = new JLabel("Organization Hierarchy");
		title.setBounds(225, 50, 500, 50);
		add(title);

		String file = "dataFile_emp.txt";
		EmployeeDataAnalyzer analyzer = new EmployeeDataAnalyzer(new FileLoader(file));
		OrgHierarchyBuilder builder = new OrgHierarchyBuilder(analyzer.getEmployees());

		Employee emp = builder.getCeo();

		DefaultMutableTreeNode node = new DefaultMutableTreeNode(emp.getEname());
		reporterNode(emp, node);
		JTree tree = new JTree(node);
		tree.setBounds(200, 100, 200, 300);

		add(tree);
		setLayout(null);
		setVisible(true);
		setSize(700, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private static void reporterNode(Employee employee, DefaultMutableTreeNode node) {
		for (Employee emp : employee.getReporters()) {
			DefaultMutableTreeNode newChild = new DefaultMutableTreeNode(emp.getEname());
			reporterNode(emp, newChild);
			node.add(newChild);
		}
	}
}
