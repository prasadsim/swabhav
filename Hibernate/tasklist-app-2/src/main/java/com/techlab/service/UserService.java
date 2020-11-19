package com.techlab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.entity.User;
import com.techlab.repository.UserRepository;

@Service("usersvc")
public class UserService {
	@Autowired
	private UserRepository repository;

	public List<User> getUsers() {
		return repository.getUsers();
	}

	public void addUser(String firstName, String lastName, String email, String username, String password) {
		repository.addUser(firstName, lastName, email, username, password);
	}

	public User getUser(int id) {
		return repository.getUserById(id);
	}

	public void deleteUser(int id) {
		repository.deleteUser(id);
	}

	public void editUser(int id, String firstName, String lastName, String email, String username, String password) {
		repository.editUser(id, firstName, lastName, email, username, password);
	}

}