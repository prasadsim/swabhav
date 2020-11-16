package com.techlabs.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	public LoginRepository repo;

	private Map<String, String> map = null;

	public LoginService() {
		System.out.println("inside loginservice");
	}

	public boolean isValidate(String username, String password) {
		map = repo.getMap();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (username.equals(entry.getKey()) && password.equals(entry.getValue())) {
				return true;
			}
		}
		if (username.equals("") || password.equals("")) {
			return false;
		}
		return false;
	}
}
