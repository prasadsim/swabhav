package com.techlab.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.techlab.entity.Student;

@Repository
public class StudentRepository {

	private List<Student> students = null;
	private SessionFactory factory = null;

	public List<Student> getStudents() {		
		Session session = factory.openSession();
		students = session.createQuery("from Student").list();
		return students;
	}
	
	public void addStudent(Student s) {	
		Session session=factory.openSession();
		session.save(s);
	}
	
	public void updateStudent(String id,String name,double cgpa) {
		Session session=factory.openSession();
		Student s = (Student) session.load(Student.class, id);
		s.setName(name);
		s.setCgpa(cgpa);
		session.update(s);
	}
	
	public void deleteStudent(String id) {
		Session session=factory.openSession();
		Student s=(Student) session.load(Student.class, id);
		session.delete(s);
	}
	
	public Student getStudentById(String id) {
		Session session=factory.openSession();
		Student s = (Student) session.load(Student.class, id);
		return s;
	}
}
