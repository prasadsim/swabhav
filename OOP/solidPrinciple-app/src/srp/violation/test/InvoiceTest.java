package srp.violation.test;

import java.util.UUID;

import srp.violation.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice invoice = new Invoice(UUID.randomUUID(),"ASH",100,0.15f);
		invoice.print();
	}

}
