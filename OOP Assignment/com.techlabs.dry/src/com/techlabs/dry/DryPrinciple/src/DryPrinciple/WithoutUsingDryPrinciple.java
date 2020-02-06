package DryPrinciple;

public class WithoutUsingDryPrinciple {
	public static void main(String[] args) {
		PetDetail pd = new PetDetail();
		pd.catDetails();
		pd.dogDetails();
	}
}

class PetDetail {

	public void catDetails() {
		System.out.println("CatDetails");
		System.out.println("Pet Name");
		System.out.println("breed");
		System.out.println("Birth Date or Age");
		System.out.println("Vaccinations");
		System.out.println("Thus Pet has any Allergy");
		System.out.println();
	}

	public void dogDetails() {
		System.out.println("DogDetails");
		System.out.println("Pet Name");
		System.out.println("breed");
		System.out.println("Birth Date or Age");
		System.out.println("Vaccinations");
		System.out.println("Thus Pet has any Allergy");
		System.out.println();

	}
}
