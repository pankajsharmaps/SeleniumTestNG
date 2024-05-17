package smokeTests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;

public class SmokeTest_Trivago extends BaseTest{
	
	@Test(groups= {"Int"})
	public void loginCheckTestTrivago() {
			
		System.out.println("Trivago - smoke");
		Reporter.log("Trivago");
		
		String expectedTitle = "trivago.in - Compare hotel prices worldwide";
		
		driver.get("https://www.trivago.in");
		String actualTitle;
		actualTitle = driver.getTitle();
		
		System.out.println("Page title is "+actualTitle);
		Reporter.log("Page title is "+actualTitle);
		
		Assert.assertEquals(expectedTitle, actualTitle);
		}

}
