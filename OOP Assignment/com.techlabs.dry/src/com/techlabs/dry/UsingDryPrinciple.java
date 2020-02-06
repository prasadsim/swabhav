package com.techlabs.dry;

public class UsingDryPrinciple {
	public static void main(String[] args) {
		PetDetails cd = new PetDetails();
		cd.studentDetails();
		cd.teacherDetails();
		cd.staffDetails();
	}
}

public class PetDetails {
	
	public void catDetails() {
		System.out.println("CatDetails");
		getDetails();
	}

	
	public void dogDetails() {
		System.out.println("DogDetails");
		getDetails();
	}
	
	public void getDetails() {
		System.out.println("Pet Name");
		System.out.println("breed");
		System.out.println("Birth Date or Age");
		System.out.println("Vaccinations");
		System.out.println("Those Pet has any Allergy");


	}
	
	
}