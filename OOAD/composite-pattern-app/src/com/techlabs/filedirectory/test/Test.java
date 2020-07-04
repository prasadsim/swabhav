package com.techlabs.filedirectory.test;

import com.techlabs.filedirectory.File;
import com.techlabs.filedirectory.Folder;

public class Test {

	public static void main(String[] args) {
		Folder root = new Folder("Movies");
		root.addChild(new File("abc", "700 mb", "avi"));
		root.addChild(new File("mno", "1 GB", "mvk"));

		Folder action = new Folder("Action");
		root.addChild(action);
		action.addChild(new File("lmi", "60 mb", "avi"));
		Folder hollywood = new Folder("Hollywood");

		action.addChild(hollywood);
		hollywood.addChild(new File("BB", "2.84 gb", "mvk"));

		Folder suspense = new Folder("suspense");
		suspense.addChild(new File("prison break", "4.90 gb", "mvk"));
		hollywood.addChild(suspense);

		action.addChild(new File("pqr", "50 mb", "avi"));
		action.addChild(new File("dhoom", "4.5 Gb", "avi"));

		Folder drama = new Folder("Drama");
		root.addChild(drama);
		drama.addChild(new File("ash", "800 mb", "avi"));
		Folder bollywood = new Folder("bollywood");
		drama.addChild(bollywood);

		bollywood.addChild(new File("mirzapur", "15gb", "avi"));
		drama.addChild(new File("opps", "800MB", "mvk"));

		System.out.println(root.show(0));

	}

}
