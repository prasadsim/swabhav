package com.techlabs.model.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.sound.midi.SysexMessage;

import com.techlabs.model.*;

public class Test {

	public static void main(String[] args) throws ParseException {
		PlacementOffice p = new PlacementOffice();
		Department cmpn = new Department("cmpn", 1501);
		Department extc = new Department("extc", 1502);
		Department iftc = new Department("iftc", 1503);

		Student prasad = new Student("Prasad", "17102C2050", "AurionPro", "BE", "26/02/1998", 8.5f, cmpn);
		Student vinit = new Student("vinit", "17102C2004", null, "BE", "26/02/1998", 8.45f, cmpn);
		Student jay = new Student("jay", "17102C2061", "FaceBook", "BE", "26/02/1998", 7.5f, extc);
		Student rajat = new Student("rajat", "17102C2015", "Google", "TE", "26/02/1998", 6.5f, iftc);
		Student sneha = new Student("sneha", "17102C2002", "Amazon", "BE", "26/02/1998", 8.85f, extc);

		College v = new College(181051, "Vidyalankar", "Wadala,Mumbai");

		v.addDept(cmpn);
		v.addDept(extc);
		v.addDept(iftc);

		v.addStudent(sneha);
		v.addStudent(prasad);
		v.addStudent(rajat);
		v.addStudent(jay);
		v.addStudent(vinit);

		cmpn.addSubjectAndProfessor("ML", "Mohini");
		cmpn.addSubjectAndProfessor("DC", "Amit");
		extc.addSubjectAndProfessor("Eccf", "Tripati");
		extc.addSubjectAndProfessor("Dle", "ashish");
		iftc.addSubjectAndProfessor("Bda", "Rugved");
		iftc.addSubjectAndProfessor("Aoa", "sanjeev");

		printInfo(v);

	}

	private static void printInfo(College v) {
		System.out.println(v + "\n");
		for (Student s : v.getStu()) {
			System.out.println(s);
		}
		System.out.println();
		for (Department d : v.getDept()) {
			System.out.println("\n" + d);
			for (Student s : d.getStu()) {
				System.out.println(s);
			}
			System.out.println("Subject And Professor");
			System.out.println(d.getSubAndProf());
		}
		System.out.println("\nList of Placed Student:");
		for (Student s : v.getPo().getPlacedStudents()) {
			System.out.println(s);
		}
	}

}
