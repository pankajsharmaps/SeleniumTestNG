package smokeTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;



public class SmokeTest_MMT //extends BaseTest
{
	
	@Test(groups= {"Dom"})
	public void loginCheckTestMMT() {
		
		WebDriver driver = new FirefoxDriver();
		
		System.out.println("MMT - smoke");
		Reporter.log("MMT");
		
		String expectedTitle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
		
		driver.get("https://www.makemytrip.com");
		String actualTitle;
		actualTitle = driver.getTitle();
		
		System.out.println("Page title is "+actualTitle);
		Reporter.log("Page title is "+actualTitle);
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
		driver.close();
	}

}
