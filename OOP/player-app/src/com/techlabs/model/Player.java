package com.techlabs.model;

public class Player {
	private int id;
	private String name;
	private int age;

	public Player(int id, String name, int age) {
		this.id=checkId(id);
		this.name=name;
		this.age = checkAge(age);
//		System.out.println("palyer cereaed");
	}

	public Player(int id, String name) {
		this(id,name,18);
	}

	private String checkName(String pname) {
		if (pname == null) {
			return "Unknown";
		}
		return pname;
	}

	private int checkId(int id) {
		if (id < 0) {
			return 1;
		}
		return id;
	}

	private int checkAge(int page) {
		if (page < 0) {
			page = 1;
			return page;
		}
		return page;
	}
	
	public Player whoIsElder(Player second) {
		if(this.age<second.age) {
			return second;
		}
		return this;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
