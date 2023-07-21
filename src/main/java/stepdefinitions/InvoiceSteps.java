package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.Invoicepage;
import wrappers.GenericWrappers;

public class InvoiceSteps extends GenericWrappers{
	
	Invoicepage invoicepage = new Invoicepage();
	
	@Then("print invoice")
	public void print_invoice() {
		invoicepage.printInvoice();
	}
	

}
