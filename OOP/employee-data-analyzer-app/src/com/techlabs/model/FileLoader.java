package com.techlabs.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FileLoader implements ILoader {

	private TreeSet<String> list = new TreeSet<String>();

	public FileLoader() throws IOException {
		String fileName = "dataFile_emp.txt";
		BufferedReader b = new BufferedReader(new FileReader(fileName));
		String line;
		while ((line = b.readLine()) != null) {
			list.add(line);
		}
	}

	@Override
	public Set<String> getData() {
		return list;
	}

}
