package com.techlabs.model.test;

import java.text.SimpleDateFormat;

import com.techlabs.model.Company;
import com.techlabs.model.PartnerCompany;
import com.techlabs.model.Senior;

public class CompanyTest {

	public static void main(String[] args) {

		Company swabhav = new Company(1001, "swabhav");

		PartnerCompany google = new PartnerCompany(1101, "google");
		PartnerCompany facebook = new PartnerCompany(1102, "facebook");

		swabhav.addPartner(google);
		swabhav.addPartner(facebook);

		Senior prasad = new Senior(101, "prasad", "software developer", 5);
		Senior vinit = new Senior(102, "vinit", "business analyst", 9);
		Senior pawan = new Senior(103, "pawan", "tester", 4);
		Senior jay = new Senior(104, "jay", "software engineer",3);

		swabhav.addSenior(prasad);
		swabhav.addSenior(vinit);
		swabhav.addSenior(pawan);
		swabhav.addSenior(jay);

//		printInfo(swabhav);
		printSeniorDetails(swabhav);

	}

	private static void printSeniorDetails(Company c) {
		System.out.println(c.getName() + " senior details:");
		for (Senior s : c.getSeniors()) {
			System.out.println("id:" + s.getId());
			System.out.println("Name:" + s.getName());
			System.out.println("Designation:" + s.getDesignation());
			System.out.println("Year of exp:" + s.getYearOfExp() + "\n");
		}
	}

	private static void printInfo(Company c) {
		System.out.println("Company " + c.getName());
		System.out.println("\nList of Partner");
		for (PartnerCompany p : c.getPartners()) {
			System.out.println(p.getName());
		}
		System.out.println("\nList of Seniors");
		for (Senior s : c.getSeniors()) {
			System.out.println(s.getName());
		}
	}

}
