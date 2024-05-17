package testCase;

import java.io.IOException;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.KayakHomePage;
import pages.KayakSearchRes;
import utilities.ReadXLSData;


@Test
public class KayakTestingDataDriven extends BaseTest{
	
	KayakHomePage khp = new KayakHomePage();	
	KayakSearchRes ksr = new KayakSearchRes();
	
	
	@Test(dataProviderClass=ReadXLSData.class, dataProvider="fnTestData")
	public void kayakTest(String destCity, String fDate, String toDate) throws InterruptedException, IOException {
		
		khp.launchURL();
//		khp.destinationSearch(destCity);
//		khp.fromDate(fDate);
//		khp.fromDate(toDate);
//		khp.clickSubmit();	
//		ksr.sr();
	
	}
}