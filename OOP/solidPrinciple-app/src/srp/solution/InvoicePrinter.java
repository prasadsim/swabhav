package srp.solution;

public class InvoicePrinter {
	private Invoice invoice;

	public InvoicePrinter(Invoice invoice2) {
		this.invoice = invoice2;
	}

	public void print() {
		System.out.println("Name:" + invoice.getName() + "\nId:" + invoice.getId() + "\nCost:" + invoice.getCost()
				+ "\nDiscountPrice:" + invoice.getDiscountPrice() + "\nCalculateTax:" + invoice.calculateTax()
				+ "\nCalculateDiscountAmount:" + invoice.calculateDiscountAmount() + "\nCalculateTotalCost:"
				+ invoice.calculateTotalCost());

	}

}
