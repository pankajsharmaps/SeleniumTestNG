package smokeTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;

public class SmokeTest_Kayak //extends BaseTest

{
	
	@Test(groups= {"Int"})
	public void loginCheckTestKayak() {
		
		WebDriver driver = new FirefoxDriver();
		
		System.out.println("KAYAK - smoke");
		Reporter.log("KAYAK");
		
		String expectedTitle = "Search Flights, Hotels & Rental Cars | KAYAK";
		
		driver.get("https://www.kayak.co.in");
		String actualTitle;
		actualTitle = driver.getTitle();
		
		System.out.println("Page title is "+actualTitle);
		Reporter.log("Page title is "+actualTitle);
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
		driver.close();
	}
}
