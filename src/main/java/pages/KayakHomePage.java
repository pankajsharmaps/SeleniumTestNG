package pages;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import base.BaseTest;
import utilities.ReadLocators;

public class KayakHomePage extends BaseTest{	
	ReadLocators rpf = new ReadLocators();
	
	public void launchURL() throws IOException {
		fr = new FileReader(System.getProperty("user.dir")+"/src/test/resources/configFiles/config.properties");
		prop.load(fr);	
		driver.get(prop.getProperty("khp_url"));
		driver.manage().window().maximize();
	}
	
		
	public void destinationSearch(String city) throws InterruptedException, FileNotFoundException {	
		
		String expectedPageTitle = rpf.getPropertyValue("expectedPageTitle");
		String actualPageTitle = driver.getTitle();
		
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
//		Assert.fail(actualPageTitle);
		
		Reporter.log(actualPageTitle);
		
		WebElement dest = driver.findElement(By.xpath(rpf.getPropertyValue("to_field")));
		
		dest.sendKeys(city);
		Thread.sleep(2000);
		dest.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		}
	
	public void fromDate(String fDate) throws InterruptedException, FileNotFoundException {
		WebElement dateEle = driver.findElement(By.xpath(rpf.getPropertyValue("cal_field")));
		List <WebElement> dates = driver.findElements(By.xpath(rpf.getPropertyValue("dates_field")));
		
//		dateEle.click();
//		Thread.sleep(2000);
		
		Actions act =  new Actions(driver);
		act.moveToElement(dateEle).click().perform();
		
		for (WebElement we : dates) {
			if (we.getAttribute("aria-label").equals(fDate)) {
				we.click();
				break;
				}
			}
		}
		
	public void toDate(String toDate) throws FileNotFoundException{
		List <WebElement> dates = driver.findElements(By.xpath(rpf.getPropertyValue("dates_field")));
		for (WebElement we : dates) {
			if (we.getAttribute("aria-label").equals(toDate)) {
				we.click();
				break;
				}
			}
		}

	public void clickSubmit() throws FileNotFoundException{
		WebElement searchBtn = driver.findElement(By.xpath(rpf.getPropertyValue("search_btn")));
//		searchBtn.click();
		
		Actions act =  new Actions(driver);
		act.moveToElement(searchBtn).click().perform();
	}
}
