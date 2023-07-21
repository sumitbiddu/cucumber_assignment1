package pages;



import com.relevantcodes.extentreports.ExtentTest;


import wrappers.GenericWrappers;

public class Checkoutpage extends GenericWrappers{
	
	
	
	public Checkoutpage validateProduct() {
		verifyTextByXpath("//span[@class='item-title']", "Mobile Applications");
		return this;
		
	}
	public Checkoutpage clickCheckout() {
		clickById("checkout");
		return this;
	}
	
	public Invoicepage clickCompleteOrder() {
		clickById("btnCompleteOrder");
		return new Invoicepage();
	}

}
