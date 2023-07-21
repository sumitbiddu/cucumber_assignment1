package stepdefinitions;

import io.cucumber.java.en.Given;
import wrappers.GenericWrappers;

public class CommonSteps extends GenericWrappers{
	
	GenericWrappers wrappers = new GenericWrappers();
	
	@Given("Opening the browser")
	public void opening_the_browser() {
		wrappers.invokeApp("chrome", "https://phptravels.org/login");
	}

}
