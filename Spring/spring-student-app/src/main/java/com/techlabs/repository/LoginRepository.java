package com.techlabs.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class LoginRepository {

	private static LoginRepository instance;
	private Map<String, String> map;

	public Map<String, String> getMap() {
		return map;
	}

	private LoginRepository() {
		map = new HashMap<String, String>();
		map.put("admin", "admin");
		map.put("ash", "ash");
	}

	public static LoginRepository getInstance() {
		if (instance == null) {
			instance = new LoginRepository();
			return instance;
		}
		return instance;
	}

}
