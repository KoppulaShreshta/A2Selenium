package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcelMethodChaining {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./src/test/resources/data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		double d = wb.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
		System.out.println(d);
	 	wb.close();
		
		

	}

}
