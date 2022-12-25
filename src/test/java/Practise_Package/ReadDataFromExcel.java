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

public class ReadDataFromExcel {

	public static void main(String[] args) throws Throwable, IOException {
		//create object of physical file
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Book3.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("sheet1");
		Row ro = sh.getRow(1);
		Cell cel = ro.getCell(1);
		String value = cel.getStringCellValue();
		System.out.println(value);

	}

}
