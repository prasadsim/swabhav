package com.techlabs.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.service.StudentService;

public class StudentTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext obj = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		StudentService service = obj.getBean("studentssvc", StudentService.class);
		System.out.println(service.getStudents().size());
		System.out.println(service.hashCode());
		System.out.println();
		StudentService service1 = obj.getBean("studentssvc", StudentService.class);
		System.out.println(service1.getStudents().size());
		System.out.println(service1.hashCode());

	}

}
