package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		//Step1:convert physical file into java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/data.xlsx");
		 
		//Step 2:open Workbook
		 Workbook wb = WorkbookFactory.create(fis);
		 
		 //Step 3:Get Control Over Sheet
		 Sheet sh = wb.getSheet("Sheet1");
		 //Step 4:GET Control Over Row
		Row r = sh.getRow(0 );
		
		//Step 5:Get Control Over Cell
		Cell c = r.getCell(1);
		 
		//Step 6:Retrieve Data
		System.out.println(c.getStringCellValue());
		
		//Step 7:Close WorkBook
		wb.close();
		 
		
		

	}

}
