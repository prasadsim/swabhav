package com.techlab.test;

import java.util.List;
import java.util.UUID;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.techlab.entity.Student;

public class StudentTest {

	public static void main(String[] args) throws IllegalStateException, SystemException, SecurityException,
			RollbackException, HeuristicMixedException, HeuristicRollbackException {
		org.hibernate.cfg.Configuration config = new org.hibernate.cfg.Configuration();
		SessionFactory factory = (SessionFactory) config.configure("hibernate.cfg.xml").buildSessionFactory();

		Student s1 = new Student();
		s1.setId(UUID.randomUUID().toString());
		s1.setName("abc");
		s1.setCgpa(8.4);
		Student s2 = new Student();
		s2.setId(UUID.randomUUID().toString());
		s2.setName("xyz");
		s2.setCgpa(9.4);
		Student s3 = new Student();
		s3.setId(UUID.randomUUID().toString());
		s3.setName("pqr");
		s3.setCgpa(5.6);

		Session session = factory.openSession();
		org.hibernate.Transaction transaction = null;

		try {
			transaction = (org.hibernate.Transaction) session.beginTransaction();
			// insert
//			session.save(s1);
//			session.save(s2);
//			session.save(s3);
//			read(session);

//			List<Student> studentList = new StudentCrud().getStudents(session);
//			printInfo(studentList);

//			System.out.println("update");
//			new StudentCrud().update(session, "9dd534c1-ce8c-4a63-8e40-cb457eca6bc8", "vinit", 8.46);
//			read(session);

			System.out.println("delete");
			new StudentCrud().delete(session, "9ead9390-e6e9-4876-8935-791429c24736");
			read(session);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}
		System.out.println("end");
	}

	public static void read(Session session) {
		System.out.println("read all");
		List<Student> studentList = new StudentCrud().getStudents(session);
		printInfo(studentList);
	}

	private static void printInfo(List<Student> studentList) {
		for (Student s : studentList) {
			System.out.println(s);
		}
	}

}
