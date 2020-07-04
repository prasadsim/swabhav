package com.techlabs.filedirectory;

public class File implements IDiskItem {

	private String name;
	private String size;
	private String extension;

	public File(String name, String size, String extension) {
		this.name = name;
		this.size = size;
		this.extension = extension;
	}

	@Override
	public String show(int level) {
		return "|-> " + name + "." + extension + " (" + size + ")";
	}

	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	public String getExtension() {
		return extension;
	}
	
}
