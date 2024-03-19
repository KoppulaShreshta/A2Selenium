package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteToExcelNewRowNewCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./src/test/resources/data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
	    Sheet sh=wb.getSheet("Sheet1");
	    Row r=sh.createRow(5);
	    Cell c1=r.createCell(0);
	    c1.setCellValue("course");
	    Cell c2=r.createCell(1);
	    c2.setCellValue("Selenium");
	    FileOutputStream fos=new FileOutputStream("./src/test/resources/data.xlsx");
	    wb.write(fos);
	    wb.close();
	    
		

	}

}
