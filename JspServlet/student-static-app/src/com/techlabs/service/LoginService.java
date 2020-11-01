package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Login;

public class LoginService {

	private static List<Login> users;
	Login user1 = new Login("admin", "admin");
	Login user2 = new Login("ash", "ash");
	Login user3 = new Login("prasad", "prasad");

	public LoginService() {
		System.out.println("inside login service");
		users = new ArrayList<Login>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
	}

	public List<Login> getUsers() {
		return users;
	}

	public boolean check(String username, String password) {
		for (Login user : users) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
}