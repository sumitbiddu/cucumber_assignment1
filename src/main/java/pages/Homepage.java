package pages;



import com.relevantcodes.extentreports.ExtentTest;


import wrappers.GenericWrappers;

public class Homepage extends GenericWrappers{
	
	
	
	public Cartpage clickServices() {
		clickById("Primary_Navbar-Services");
		clickById("Primary_Navbar-Services-Order_New_Services");
		return new Cartpage();
		
	}
	

	
	
}
