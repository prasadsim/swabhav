package srp.solution;

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
