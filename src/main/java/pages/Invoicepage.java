package pages;



import com.relevantcodes.extentreports.ExtentTest;


import wrappers.GenericWrappers;

public class Invoicepage extends GenericWrappers{
	
	
	
	public Invoicepage printInvoice() {
		clickByXpath("//a[@class='btn btn-default']");
		return this;
	}

}