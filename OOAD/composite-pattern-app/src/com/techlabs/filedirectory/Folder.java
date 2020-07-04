package com.techlabs.filedirectory;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IDiskItem {

	static int space = 0;
	private String name;
	private List<IDiskItem> children = new ArrayList<IDiskItem>();

	public Folder(String name) {
		this.name = name;
	}

	public void addChild(IDiskItem item) {
		children.add(item);
	}

	public String getName() {
		return name;
	}

	public List<IDiskItem> getChildren() {
		return children;
	}

	@Override
	public String show(int level) {
		level++;
		String item = this.name + "\n";
		for (IDiskItem children : children) {
			if (children instanceof File)
				item = item + separator(level) + children.show(level) + "\n";
			else
				item = item + separator(level) + children.show(level);

		}
		return item;

	}
	private String separator(int level) {
		String space = "";
		for (int i = 0; i < level; i++) {
			space = space + "    ";

		}
		return space;
	}

}
