package com.techlabs.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Organization {
	private UUID id;
	private String name;
	private Date registrationDate;
	private List<Partner> partners = new ArrayList<Partner>();
	private List<Talent> talents = new ArrayList<Talent>();

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");

	public Organization(UUID id, String name, String registrationDate)
			throws ParseException, UnsupportedOperationException {
		this.id = id;
		this.name = name;
		this.registrationDate = sdf.parse(registrationDate);
	}

	public void addPartner(Partner partner) {
		this.partners.add(partner);
	}

	public void addTalent(Talent talent) {
		this.talents.add(talent);
	}

	public int countPartner() {
		return partners.size();
	}

	public int countTalent() {
		return talents.size();
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public Iterable<Partner> getPartners() {
		return partners;
	}

	public Iterable<Talent> getTalents() {
		return talents;
	}

}
