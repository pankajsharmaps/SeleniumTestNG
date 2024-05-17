package smokeTests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;


public class SmokeTest_EaseMyTrip extends BaseTest {
	
	@Test(groups= {"Dom"})
	public void loginCheckTestEMT() {
		
		System.out.println(" ***** Thread ID Is : " + Thread.currentThread().getId()); 
		
		System.out.println("EMT - smoke");
		Reporter.log("EMT");
			
		String expectedTitle = "Book Flights, Hotels, Holidays, Bus & Train Tickets - EaseMyTrip.com***";
	
		driver.get("https://www.easemytrip.com");
		String actualTitle;
		actualTitle = driver.getTitle();
		
		System.out.println("Page title is "+actualTitle);
		Reporter.log("Page title is "+actualTitle);
		
		Assert.assertEquals(expectedTitle, actualTitle, "Title asertion check");
		
		}

}
