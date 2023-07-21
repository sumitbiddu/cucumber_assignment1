package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Cartpage;
import wrappers.GenericWrappers;

public class CartSteps extends GenericWrappers{
	
	Cartpage cartpage = new Cartpage();
	
	@And("click mobile")
	public void click_mobile() {
		cartpage.clickMobile();
	}
	
	@Then("click order")
	public void click_order() {
		cartpage.clickOrder();
	}
	
	@Then("click add to cart")
	public void click_add_to_cart() {
		cartpage.clickAddToCart();
	}
	

}
