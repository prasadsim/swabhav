package com.techlabs.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.service.StudentService;

public class StudentTest {
	public static void main(String args[]) {

		ClassPathXmlApplicationContext obj = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");
		StudentService svc = obj.getBean("studentsvcc", StudentService.class);
		System.out.println(svc.getStudents().size());
		System.out.println(svc.hashCode());

		StudentService svc1 = obj.getBean("studentsvcc", StudentService.class);
		System.out.println(svc.getStudents().size());
		System.out.println(svc.hashCode());
	}
}