package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadExcel implements IConstant{
	//here 
	public String getDataFromExcel(String sheet,int rownum,int colnum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(ExcelPath);
		Workbook w=WorkbookFactory.create(fis);
		String value=w.getSheet(sheet).getRow(rownum).getCell(colnum).toString();
		return value;
	}

}
