package com.techlabs.service;

import java.util.HashMap;
import java.util.Map;

public class LoginService {

	private Map<String, String> map;
	private static LoginService ls;

	private LoginService() {
		map = new HashMap<String, String>();
		map.put("admin", "admin");
		map.put("prasad", "prasad");
		map.put("ash", "ash");
	}

	public static LoginService getInstance() {
		if (ls == null) {
			ls = new LoginService();
		}
		return ls;
	}

	public boolean isValidate(String username, String password) {
		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (username.equals(entry.getKey()) && password.equals(entry.getValue())) {
				return true;
			}
		}
		return false;
	}
}