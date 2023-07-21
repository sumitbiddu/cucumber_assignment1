package pages;


import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;


import wrappers.GenericWrappers;

public class Loginpage extends GenericWrappers{
	
	
	
	public Loginpage enterUserName() {
		enterById("inputEmail", UN);
		return this;
	}
	
	public Loginpage enterPassword() {
		enterById("inputPassword", PW);
		return this;
	}
	
	public Loginpage clickCheckBox() throws InterruptedException  {
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
		switchToFrame("//iframe[@title='reCAPTCHA']");
		Thread.sleep(3000);
		//driver.findElementByXPath("//div[@class='recaptcha-checkbox-border']").click();
		clickByXpath("//div[@class='recaptcha-checkbox-border']");
		defaultContent();
		Thread.sleep(25000);
		return this;
	}
	
	
	
	public Homepage clickLogin() {
		clickById("login");
		return new Homepage();
	}

}
