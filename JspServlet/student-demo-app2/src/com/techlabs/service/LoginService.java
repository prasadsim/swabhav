package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Login;

public class LoginService {

	private static LoginService instance;
	private List<Login> users;
	Login user1 = new Login("admin", "admin");
	Login user2 = new Login("ash", "ash");
	Login user3 = new Login("prasad", "prasad");

	private LoginService() {
		users = new ArrayList<Login>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
	}

	public static LoginService getInstance() {
		if (instance == null) {
			instance = new LoginService();
		}
		return instance;
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