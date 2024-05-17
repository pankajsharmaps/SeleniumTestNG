package base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public static WebDriver driver;
	public static WebDriverWait Wait;
	public static FileReader fr;
	public static Properties prop = new Properties ();
	
	@BeforeMethod
	public void setUp() throws IOException {
		
		if(driver==null) {
			fr = new FileReader(System.getProperty("user.dir")+"/src/test/resources/configFiles/config.properties");
			prop.load(fr);			
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
//			ChromeOptions options = new ChromeOptions();
//			driver = new ChromeDriver(options);
			driver = new ChromeDriver();
			Wait  = new WebDriverWait (driver, Duration.ofSeconds(20));

		}
		
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
//			FirefoxOptions options = new FirefoxOptions();
//			driver = new FirefoxDriver(options);
			driver = new FirefoxDriver();
			Wait  = new WebDriverWait (driver, Duration.ofSeconds(20));
			
		}
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}