package com.techlabs.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

public class UrlLoader implements ILoader {

	private TreeSet<String> list = new TreeSet<String>();

	public UrlLoader() throws IOException {
		String line;
		URL url = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");
		BufferedReader b = new BufferedReader(new InputStreamReader(url.openStream()));
		while ((line = b.readLine()) != null) {
			list.add(line);
		}
	}

	@Override
	public Set<String> getData() {
		return list;
	}
}
