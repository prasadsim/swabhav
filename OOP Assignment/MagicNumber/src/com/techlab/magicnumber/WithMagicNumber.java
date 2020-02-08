package com.techlab.magicnumber;

public class WithMagicNumber {
	
		final static public String IP = "192.0.0.1";
		final static public String USERNAME = "ash";
		final static public int TIMEOUT = 10000;

		public void serve(String ip, int port, String user, int timeout) {
			System.out.println(ip);
			System.out.println(port);
			System.out.println(user);
			System.out.println(timeout);
		}

		public static void main(String[] args) {
			int internal_port = 8080; // Magic number

			new WithMagicNumber().serve(IP, internal_port, USERNAME, TIMEOUT);
		}

	}

