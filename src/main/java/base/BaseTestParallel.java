package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseTestParallel {

	 public WebDriver driver;
	 @Test
	  public void FirefoxTest() {	 
		 System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
		 driver = new FirefoxDriver();	  
		 driver.get("https://www.google.com"); 
		 System.out.println(driver.getTitle());
		 driver.close();
		 
	  }
	 
	 @Test
	 public void ChromeTest()
	 { 
	       System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
	       driver = new ChromeDriver();
	       driver.get("https://yahoo.com");
	       System.out.println(driver.getTitle());
	       driver.close();
	     
	}
}