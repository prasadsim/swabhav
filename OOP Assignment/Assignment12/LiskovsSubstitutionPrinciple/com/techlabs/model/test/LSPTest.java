package com.techlabs.model.test;

import com.techlabs.model.AnnualTimeMember;
import com.techlabs.model.Enquiry;
import com.techlabs.model.IDataBase1;
import com.techlabs.model.LifeTimeMember;
import com.techlabs.model.Member;

public class LSPTest {
	public static void main(String[] args) {
		Member member1 = new LifeTimeMember("Prasad");
		Member member2 = new AnnualTimeMember("Ash");
		Enquiry enquiry = new Enquiry();
		IDataBase1[] operations= {member1,member2,enquiry};
		printDatabaseOpertions(operations);
	}

	private static void printDatabaseOpertions(IDataBase1[] operations) {
		for(IDataBase1 operation:operations) {
			operation.addToDatabase();
		}
	}

}
