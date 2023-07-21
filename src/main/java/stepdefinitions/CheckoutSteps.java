package stepdefinitions;

import io.cucumber.java.en.And;
import pages.Checkoutpage;
import wrappers.GenericWrappers;

public class CheckoutSteps extends GenericWrappers{
	
	Checkoutpage checkoutpage = new Checkoutpage();
	
	@And("validate product")
	public void validate_product() {
		checkoutpage.validateProduct();
	}
	
	@And("click checkout")
	public void click_checkout() {
		checkoutpage.clickCheckout();
	}

	@And("click complete order")
	public void click_complete_order() {
		checkoutpage.clickCompleteOrder();
	}
	
	
}
