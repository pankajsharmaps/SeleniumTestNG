package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadLocators  {
	
	String locatorFilePath = "/Users/Pankaj/xtra/SeleniumWorkspace/AutomationFramework/src/test/resources/configFiles/locators.properties";;
	
	public String getPropertyValue(String attributeName) throws FileNotFoundException {
		FileReader fr =new FileReader(locatorFilePath);
		Properties p = new Properties ();
		try {
			p.load(fr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return p.getProperty(attributeName);
	}
}