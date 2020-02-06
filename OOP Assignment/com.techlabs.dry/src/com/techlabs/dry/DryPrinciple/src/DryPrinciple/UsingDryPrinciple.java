package DryPrinciple;

public class UsingDryPrinciple {
	public static void main(String[] args) {
		PetDetails pd = new PetDetails();
		pd.catDetails();
		pd.dogDetails();
	}
}

class PetDetails {

	public void catDetails() {
		System.out.println("CatDetails");
		getDetails();
		System.out.println();
	}

	public void dogDetails() {
		System.out.println("DogDetails");
		getDetails();
		System.out.println();

	}

	public void getDetails() {
		System.out.println("Pet Name");
		System.out.println("breed");
		System.out.println("Birth Date or Age");
		System.out.println("Vaccinations");
		System.out.println("Thus Pet has any Allergy");

	}

}
