package com.techlab.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlab.entity.Actor;
import com.techlab.entity.Movie;

public class Test {

	public static void main(String[] args) {

		Movie m1 = new Movie();
		m1.setId(UUID.randomUUID().toString());
		m1.setMovieName("movie1");

		Movie m2 = new Movie();
		m2.setId(UUID.randomUUID().toString());
		m2.setMovieName("movie2");

		Actor a1 = new Actor();
		a1.setId(UUID.randomUUID().toString());
		a1.setActorName("ash");

		Actor a2 = new Actor();
		a2.setId(UUID.randomUUID().toString());
		a2.setActorName("flacko");

		Actor a3 = new Actor();
		a3.setId(UUID.randomUUID().toString());
		a3.setActorName("drake");

		Set<Actor> movieOneActors = new HashSet();
		movieOneActors.add(a1);
		movieOneActors.add(a2);
		Set<Actor> movieTwoActors = new HashSet();
		movieTwoActors.add(a2);
		movieTwoActors.add(a3);

		m1.setActors(movieOneActors);
		m2.setActors(movieTwoActors);

		Set<Movie> ashMovies = new HashSet();
		ashMovies.add(m1);
		Set<Movie> flackoMovies = new HashSet();
		flackoMovies.add(m1);
		flackoMovies.add(m2);
		Set<Movie> drakeMovies = new HashSet();
		drakeMovies.add(m2);

		a1.setMovies(ashMovies);
		a2.setMovies(flackoMovies);
		a3.setMovies(drakeMovies);

		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			List<Actor> actors = new ArrayList();
			List<Movie> movies = new ArrayList();

			transaction = session.beginTransaction();
//			session.save(m1);
//			session.save(m2);
//			session.save(a1);
//			session.save(a2);
//			session.save(a3);
//			actors = session.createQuery("from Actor").list();
//			printInfo(actors);
			movies = session.createQuery("from Movie").list();
			printInfo(movies);
			transaction.commit();
			System.out.println("end");
		} catch (HibernateException e) {
			transaction.rollback();
			System.out.println(e);
		} finally {
			session.close();
		}
	}

	private static void printInfo(List<?> objects) {
		for (Object o : objects) {
			System.out.println(o.toString());
		}
	}
}
