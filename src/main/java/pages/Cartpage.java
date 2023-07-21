package pages;



import com.relevantcodes.extentreports.ExtentTest;


import wrappers.GenericWrappers;

public class Cartpage extends GenericWrappers{
	
	
	public Cartpage clickMobile() {
		clickById("Secondary_Sidebar-Categories-Mobile");
		return this;
		
	}
	
	public Cartpage clickOrder() {
		clickById("product1-order-button");
		return this;
	}
	
	public Checkoutpage clickAddToCart() {
		clickByXpath("//div[@class='panel-add']");
		clickById("btnCompleteProductConfig");
		return new Checkoutpage();
	}
	
	

}
