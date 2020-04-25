package com.techlabs.model;

public class Boy implements IEmotionable, IMannerable{

	@Override
	public void wish() {
		System.out.println("Boy is Wishing");
		
	}

	@Override
	public void depart() {
		System.out.println("Boy is Departing");		
	}

	@Override
	public void cry() {
		System.out.println("Boy is Crying");		
	}

	@Override
	public void laugh() {
		System.out.println("Boy is Laughing");		
	}

}
