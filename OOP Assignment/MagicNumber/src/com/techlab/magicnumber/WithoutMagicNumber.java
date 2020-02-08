package com.techlab.magicnumber;

public class WithoutMagicNumber {
	final static public String IP = "192.0.0.1";
	final static public int PORT = 8080;
	final static public String USERNAME = "ash";
	final static public int TIMEOUT = 100000;

	public void serve(String ip, int port, String user, int timeout) {
		System.out.println(ip);
		System.out.println(port);
		System.out.println(user);
		System.out.println(timeout);

	}

	public static void main(String[] args) {

		new WithoutMagicNumber().serve(IP, PORT, USERNAME, TIMEOUT);
	}
}
