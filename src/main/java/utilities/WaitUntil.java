package utilities;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;

public class WaitUntil extends BaseTest{	
	public WebElement waitForElementLocated (String locatorType, String locator) {
		WebDriverWait Wait = new WebDriverWait (driver, Duration.ofSeconds(20));
		WebElement ele = Wait.until(ExpectedConditions.presenceOfElementLocated(locatorType(locator)));	
		return ele;
	}

	private By locatorType(String locator) {
		// TODO Auto-generated method stub
		return By.xpath(locator);
	}
}