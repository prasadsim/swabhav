package com.techlab.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlab.entity.User;

@Repository
@Transactional
public class UserRepository {

	@Autowired
	private SessionFactory fact;

	public List<User> getUsers() {
		List<User> users = fact.getCurrentSession().createQuery("from User").list();
		return users;
	}

	public User getUserById(int id) {
		for (User u : getUsers()) {
			if (u.getId() == id) {
				return u;
			}
		}
		return null;
	}

	public void addUser(String firstName, String lastName, String email, String username, String password) {
		User user = new User(firstName, lastName, email, username, password);
		fact.getCurrentSession().save(user);
	}

	public void deleteUser(int id) {
		User user = getUserById(id);
		fact.getCurrentSession().delete(user);
	}

	public void editUser(int id, String firstName, String lastName, String email, String username, String password) {
		User user = getUserById(id);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setUsername(username);
		user.setPassword(password);
		fact.getCurrentSession().update(user);
	}
}
