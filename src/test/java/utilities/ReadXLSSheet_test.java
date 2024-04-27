package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadXLSSheet_test {
	
	static String path = "/Users/Pankaj/Desktop/testData.xlsx";
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		readData();
	}
	
	
	private static void readData() throws EncryptedDocumentException, IOException{
		
		FileInputStream f = new FileInputStream(path);
		
		Workbook wb = WorkbookFactory.create(f);
		
		String sheetName = "kayakTest";
		
		Sheet currentSheet = wb.getSheet(sheetName);
		
		int rows = currentSheet.getLastRowNum();
		Row row = currentSheet.getRow(0);
		int cols = row.getLastCellNum();
		
		DataFormatter df = new DataFormatter();
		
		String data[][] = new String[rows][cols];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				data[i][j]=df.formatCellValue(currentSheet.getRow(i).getCell(j));
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
		
		
	}

}