package srp.violation;

import java.util.UUID;

public class Invoice {
	private UUID id;
	private String name;
	private double cost;
	private float discountPrice;
	private final static double gst = 0.12;

	public Invoice(UUID id, String name, double cost, float discountPrice) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discountPrice = discountPrice;
	}

	public double calculateTax() {
		return (this.cost * this.gst);
	}

	public double calculateDiscountAmount() {
		return this.cost - (this.cost * this.discountPrice);
	}

	public double calculateTotalCost() {
		return calculateDiscountAmount() + calculateTax();
	}

	public void print() {
		System.out.println("Name:" + this.name + "\nId:" + this.id + "\nCost:" + this.cost + "\nDiscountPrice:"
				+ this.discountPrice + "\nCalculateTax:" + this.calculateTax() + "\nCalculateDiscountAmount:"
				+ this.calculateDiscountAmount() + "\nCalculateTotalCost:" + this.calculateTotalCost());
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public float getDiscountPrice() {
		return discountPrice;
	}

	public static double getGst() {
		return gst;
	}

}
