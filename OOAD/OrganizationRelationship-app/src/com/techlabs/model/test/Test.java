package com.techlabs.model.test;

import java.text.ParseException;
import java.util.UUID;

import com.techlabs.model.*;

public class Test {

	public static void main(String[] args) throws ParseException, UnsupportedOperationException {

		Organization swabhav = new Organization(UUID.randomUUID(), "Swabhav", "09/DEC/2020");

		Partner aurionpro = new Partner(UUID.randomUUID(), "AurionPro", 846550, 15000);
		Partner google = new Partner(UUID.randomUUID(), "Google", 1004000, 452055);
		Partner facebook = new Partner(UUID.randomUUID(), "FaceBook", 850000, 488852);

		swabhav.addPartner(aurionpro);
		swabhav.addPartner(google);
		swabhav.addPartner(facebook);

		Talent rajat = new Talent(UUID.randomUUID(), "rajat", 8.5, "Google", "linux");
		Talent sneha = new Talent(UUID.randomUUID(), "sneha", 8.5, "AurionPro", "linux");
		Talent vaibhav = new Talent(UUID.randomUUID(), "vaibhav", 8.5, "facebook", "linux");
		Talent pablo = new Talent(UUID.randomUUID(), "pablo", 8.5, "AurionPro", "linux");
		Talent ash = new Talent(UUID.randomUUID(), "Ash", 8.5, "AurionPro", "linux");
		Talent prasad = new Talent(UUID.randomUUID(), "Prasad", 7.5, "Google", "Java");
		Talent sim = new Talent(UUID.randomUUID(), "Sim", 8.78, null, "DataBase");
		Talent vinit = new Talent(UUID.randomUUID(), "vinit", 8.78, "google", "C#");
		Talent pawan = new Talent(UUID.randomUUID(), "pawan", 8.78, null, "Data Science");
		Talent jay = new Talent(UUID.randomUUID(), "jay", 8.78, "facebook", "Python");

		swabhav.addTalent(rajat);
		swabhav.addTalent(sneha);
		swabhav.addTalent(vaibhav);
		swabhav.addTalent(pablo);
		swabhav.addTalent(ash);
		swabhav.addTalent(prasad);
		swabhav.addTalent(sim);
		swabhav.addTalent(vinit);
		swabhav.addTalent(pawan);
		swabhav.addTalent(jay);

		for (Partner p : swabhav.getPartners()) {
			for (Talent t : swabhav.getTalents()) {
				if (p.getName().equalsIgnoreCase(t.getPartner())) {
					p.addTalent(t);
				}
			}
		}

		printInfo(swabhav);
		printInfo(google);
		printInfo(facebook);
		printInfo(aurionpro);
	}

	private static void printInfo(Partner p) {
		System.out.println("\nPartner:" + p.getName() + " has total " + p.countTalent() + " Talents!");
		for (Talent t : p.getTalents()) {
			System.out.println("Talent Id:" + t.getId());
			System.out.println("Talent Name:" + t.getName());
			System.out.println("Talent Cgpa:" + t.getCgpa());
			System.out.println("Talent Associated Company:" + t.getPartner());
			System.out.println("Talent TechStack:" + t.getTechStack() + "\n");
		}

	}

	private static void printInfo(Organization s) {
		System.out.println("Organization Id:" + s.getId() + "\nOrganization Name:" + s.getName()
				+ "\nOrganization RegistrationDate:" + s.getRegistrationDate());
		System.out.println("\nOrganization:" + s.getName() + " has these Partners");
		for (Partner p : s.getPartners()) {
			System.out.println("Partner Id:" + p.getId());
			System.out.println("Partner Name:" + p.getName());
			System.out.println("Partner TurnOver:" + p.getCompanyTurnOver());
			System.out.println("Partner EmpStrength:" + p.getEmpStrength() + "\n");
		}
		System.out.println("Organization:" + s.getName() + " has these Talents");
		for (Talent t : s.getTalents()) {
			System.out.println("Talent Id:" + t.getId());
			System.out.println("Talent Name:" + t.getName());
			System.out.println("Talent Cgpa:" + t.getCgpa());
			System.out.println("Talent Associated Company:" + t.getPartner());
			System.out.println("Talent TechStack:" + t.getTechStack() + "\n");
		}
		System.out.println("Organization " + s.getName() + " has total " + s.countPartner() + " Partners!");
		System.out.println("Organization " + s.getName() + " has total " + s.countTalent() + " Talents!");
	}

}
