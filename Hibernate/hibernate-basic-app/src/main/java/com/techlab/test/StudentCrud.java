package com.techlab.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.techlab.entity.Student;

public class StudentCrud {

	public List<Student> getStudents(Session session) {
		List<Student> students = new ArrayList();
		try {
			students = session.createQuery("from Student").list();
		} catch (Exception e) {
			System.out.println(e);
		}
		return students;
	}

	public void update(Session session, String id, String name, double cgpa) {
		try {
			Student s = (Student) session.load(Student.class, id);
			s.setName(name);
			s.setCgpa(cgpa);
			session.update(s);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void delete(Session session, String id) {
		try {
			Student s = (Student) session.load(Student.class, id);
			session.delete(s);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
