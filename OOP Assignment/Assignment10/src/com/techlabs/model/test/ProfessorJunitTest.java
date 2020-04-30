package com.techlabs.model.test;

import com.techlabs.model.*;
import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

class ProfessorJunitTest {

	public Professor setup() throws ParseException {
		Professor pro = new Professor(new Person(15001, "Anderi", "04/05/1988"), 4500);
		return pro;
	}

	@Test
	void testProfessorId() throws ParseException {
		int actualId = setup().getPerson().getId();
		int expectedId = 15001;
		assertEquals(expectedId, actualId);
	}

	void testProfessorAddress() throws ParseException {
		String actualAddress = setup().getPerson().getAddress();
		String expectedAddress = "Anderi";
		assertEquals(expectedAddress, actualAddress);
	}

	void testProfessorDOB() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date actualDate = setup().getPerson().getDob();
		Date expectedDate = (Date) sdf.parse("04/05/1988");
		assertEquals(expectedDate, actualDate);
	}

	void testProfessorBasicSalary() throws ParseException {
		double actualBasicSalary = setup().getBasicSalary();
		double expectedBasicSalary = 4500;
		assertEquals(expectedBasicSalary, actualBasicSalary);
	}

	void testProfessorGrossSalary() throws ParseException {
		double actualGrossSalary = setup().getCalculatedSalary(5);
		double expectedGrossSalary = 4500 * 5;
		assertEquals(expectedGrossSalary, actualGrossSalary);
	}

}
