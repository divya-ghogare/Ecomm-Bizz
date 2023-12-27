package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import BaseClass.Base_Class;

public class Excel_Handling extends Base_Class{

	public Excel_Handling() throws IOException {
		super();
	}
    
	public static String Excelsheet_Path="../ITECH_Magento_Project1/src/main/java/Utility/customercredential excel.xlsx";
	public static Sheet sheet;
	public static Workbook workbook;
	
	public static Object[][] getTestData(String sheetname) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream(Excelsheet_Path);
		
		workbook=WorkbookFactory.create(fis);
		
		sheet=workbook.getSheet(sheetname);
		
		Object [][] dataobject=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int r=0; r<sheet.getLastRowNum(); r++) {
			for(int c = 0; c<sheet.getRow(0).getLastCellNum(); c++) {
				dataobject[r][c]=sheet.getRow(r+1).getCell(c).toString();
			}
		}
		return dataobject;
	}
}
