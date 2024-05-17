package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadXLSData {	
	File f = new File(System.getProperty("user.dir")+"/src/test/resources/testData/testData1.xlsx");
	
	@DataProvider(name="fnTestData")
	
// 		getData(Method m): This will pass the sheet name, which is same as TC name. Example: TC name is "KayakUsingExcelData"
	public String [][] getData(Method m) throws EncryptedDocumentException, IOException { 
		
//		Step 1- Create a FileInputStream		
		FileInputStream fis = new FileInputStream(f);
		
//		Step 2- Create Workbook and pass the above fis in the workbook
		Workbook wb = WorkbookFactory.create(fis);
		
//		Step 3- Get excelSheetName from Method object
		String excelSheetName = m.getName();		
		
//		Step 4- Assign sheetName, received from above step
		Sheet sheetName = wb.getSheet(excelSheetName);
		
//		Step 5- Get totalRowCount, totalColumnCount
		int totalRow = sheetName.getLastRowNum();
		Row rowCells = sheetName.getRow(0);
		int totalCol = rowCells.getLastCellNum();
		
//		Step 6- Create an object of DataFormatter
		DataFormatter format = new DataFormatter();
		
//		Step 7- Create a 2 D String array
		String testData [][] = new String[totalRow+1][totalCol];
		
//		Step 8- Run loop to assign value in created array
		for (int i=0; i<=totalRow; i++) {
			for (int j=0; j<totalCol; j++) {		
					testData[i][j]=format.formatCellValue(sheetName.getRow(i).getCell(j));
					System.out.println(testData[i][j]);			
			}
		}
//		Step 9- Return the array
	return testData;	
	}
}