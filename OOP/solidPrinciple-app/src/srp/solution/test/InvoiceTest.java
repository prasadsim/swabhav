package srp.solution.test;

import java.util.UUID;

import srp.solution.InvoicePrinter;
import srp.solution.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice(UUID.randomUUID(), "ASH", 100, 0.15f);
		InvoicePrinter invoiceprint = new InvoicePrinter(invoice);
		invoiceprint.print();

	}

}
