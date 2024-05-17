package smokeTests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;

public class SmokeTest_Kayak extends BaseTest{
	
	@Test(groups= {"Int"})
	public void loginCheckTestKayak() {
		
		System.out.println("KAYAK - smoke");
		Reporter.log("KAYAK");
		
		String expectedTitle = "Search Flights, Hotels & Rental Cars | KAYAK";
		
		driver.get("https://www.kayak.co.in");
		String actualTitle;
		actualTitle = driver.getTitle();
		
		System.out.println("Page title is "+actualTitle);
		Reporter.log("Page title is "+actualTitle);
		
		Assert.assertEquals(expectedTitle, actualTitle);
	}

}
