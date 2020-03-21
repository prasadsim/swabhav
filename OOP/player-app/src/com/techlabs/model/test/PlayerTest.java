package com.techlabs.model.test;

import com.techlabs.model.Player;

public class PlayerTest {
	public static void main(String args[]) {
		Player sachin = new Player(101, "Sachin", 10);
		Player virat = new Player(102, "Virat");
		printInfo(sachin);
		printInfo(virat);
		Player temp = virat.whoIsElder(sachin);
		System.out.println("Elder Player is "+temp.getName()+"\n");
		System.out.println(temp.hashCode());
		System.out.println(sachin.hashCode());
		System.out.println(virat.hashCode());
	}

	private static void printInfo(Player p) {
		System.out.println("Player Id:" + p.getId());
		System.out.println("Player Name:" + p.getName());
		System.out.println("Player AGE:" + p.getAge() + "\n");
	}
}
