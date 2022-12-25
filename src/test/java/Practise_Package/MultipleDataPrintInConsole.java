package Practise_Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDataPrintInConsole {

	public static void main(String[] args) throws Throwable, IOException {
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Book3.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("sheet1");
		Sheet sh = wb.getSheetAt(0);
		
		for (int i = 0; i <= sh.getLastRowNum(); i++) {
			 Row ro = sh.getRow(i);
			 Cell cel = ro.getCell(1);
			 String value = cel.getStringCellValue();
			 System.out.println(value);
		}

	}

}
