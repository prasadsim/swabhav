package com.techlabs.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.Student;

@Repository
public class StudentRepository {

	private List<Student> students = null;
	@Autowired
	private SessionFactory factory;

	public List<Student> getStudents() {
		Session session = factory.openSession();
		students = session.createQuery("from Student").list();
		return students;
	}

	public void addStudent(Student s) {
		Session session = factory.openSession();
		session.save(s);
	}

	public void updateStudent(Student student) {
		Session session = factory.openSession();
		Student s = (Student) session.load(Student.class, student.getId());
		s.setName(student.getName());
		s.setAge(student.getAge());
		s.setRollno(student.getRollno());
		session.update(s);
	}

	public void deleteStudent(String id) {
		Session session = factory.openSession();
		Student s = (Student) session.load(Student.class, id);
		session.delete(s);
	}

	public Student getStudentById(String id) {
		Session session = factory.openSession();
		Student s = (Student) session.load(Student.class, id);
		return s;
	}
}
