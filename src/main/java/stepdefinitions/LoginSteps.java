package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.Loginpage;
import wrappers.GenericWrappers;

public class LoginSteps extends GenericWrappers{
	
	Loginpage loginpage = new Loginpage();
	
	@And("Enter username")
	public void enter_username() {
		loginpage.enterUserName();
	}

	@When("Enter password")
	public void enter_password() {
		loginpage.enterPassword();
	}
	@And("click checkbox")
	public void click_checkbox() throws InterruptedException {
		loginpage.clickCheckBox();
	}
	@And("click login")
	public void click_login() {
		loginpage.clickLogin();
	}
}
