package com.techlabs.model.test;

import com.techlabs.model.*;
import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

class StudentJunitTest {

	public Student setup() throws ParseException {
		Student stu = new Student(new Person(1001, "Lower Parel", "26/02/1998"), Branch.CMPN);
		return stu;
	}

	@Test
	void testStudentId() throws ParseException {
		int actualId = setup().getPerson().getId();
		int expectedId = 1001;
		assertEquals(expectedId, actualId);

	}

	void testStudentAddress() throws ParseException {
		String actualAddress = setup().getPerson().getAddress();
		String expectedAddress = "Lower Parel";
		assertEquals(expectedAddress, actualAddress);

	}

	void testStudentDOB() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date actualDate = setup().getPerson().getDob();
		Date expectedDate = (Date) sdf.parse("26/02/1998");
		assertEquals(expectedDate, actualDate);

	}

	void testStudentBranch() throws ParseException {
		Branch actualBranch = setup().getBranch();
		Branch expectedBranch = Branch.CMPN;
		assertEquals(expectedBranch, actualBranch);

	}

}
