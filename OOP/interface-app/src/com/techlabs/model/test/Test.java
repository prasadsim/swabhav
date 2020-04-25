package com.techlabs.model.test;

import com.techlabs.model.*;

public class Test {

	public static void main(String[] args) {

		Man man = new Man();
		Boy boy = new Boy();
//		atMovieHall(man);
		atMovieHall(boy);
		atThePartyHall(man);
		atThePartyHall(boy);
	}

	private static void atThePartyHall(IMannerable obj) {
		System.out.println("At the Party Hall");
		obj.depart();
		obj.wish();
		System.out.println();
	}

	private static void atMovieHall(IEmotionable obj) { // man implements mannerable so it display error
		System.out.println("At the Movie Hall");
		obj.cry();
		obj.laugh();
		System.out.println();
	}

}
