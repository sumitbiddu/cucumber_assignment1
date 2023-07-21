package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.Homepage;
import wrappers.GenericWrappers;

public class HomeSteps extends GenericWrappers {
	
	Homepage homepage = new Homepage();
	
	@Then("click services")
	public void click_services() {
		homepage.clickServices();
	}
	
	
}
