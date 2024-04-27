package pages;

import java.io.FileNotFoundException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import base.BaseTest;
import utilities.ReadLocators;

public class KayakSearchRes extends BaseTest{
	ReadLocators rpf = new ReadLocators();
	
	public void sr() throws InterruptedException, FileNotFoundException {
		
		WebElement cheapestLink = Wait
		        .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(rpf.getPropertyValue("cheapest_link_css"))));
		
		cheapestLink.click();
				
		Thread.sleep(5000);
		List <WebElement> priceList = Wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(rpf.getPropertyValue("price_text_xpath"))));		
		
		System.out.println(priceList.size());
		Reporter.log("The number of result in default view is : " +priceList.size());
		
		Thread.sleep(5000);
		
		int[] priceArrayInt = new int[priceList.size()];

		for (int i=0; i<priceList.size();i++) {
			priceArrayInt[i] = Integer.parseInt(((priceList.get(i).getText()).split(" ")[1]).replace(",", ""));	
		}
		
		boolean priceSortCheck = true;
		for (int i = 0; i < priceArrayInt.length-1; i++) { 
		    if (priceArrayInt[i] > priceArrayInt[i+1]) {
		    	Reporter.log("Price displayed on page is in not SORTED");
		        priceSortCheck = false;
		    }
		}
		if(priceSortCheck) Reporter.log("Price displayed on page is in SORTED order");
	}
}