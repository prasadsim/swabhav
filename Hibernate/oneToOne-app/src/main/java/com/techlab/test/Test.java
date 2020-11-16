package com.techlab.test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlab.entity.Profile;
import com.techlab.entity.User;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();

		Profile p = new Profile();
		p.setId(UUID.randomUUID().toString());

		User u = new User();
		u.setId(UUID.randomUUID().toString());
		u.setName("ash");

		u.setProfile(p);
//		p.setUser(u);

		Session session = factory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
//			session.save(u);
//			session.save(p);

			List<User> users = new ArrayList();
			users = session.createQuery("from User").list();
			printInto(users);
			transaction.commit();
			System.out.println("end");
		} catch (HibernateException e) {
			transaction.rollback();
			System.out.println(e);
		} finally {
			session.close();
		}
	}

	private static void printInto(List<User> objects) {
		for (User o : objects) {
			System.out.println(o);
		}
	}

}
