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

public class MultipledataExcelConsole {

	public static void main(String[] args) throws Throwable, IOException {
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Book3.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheetAt(0);
		int count = sh.getLastRowNum()-sh.getFirstRowNum();
		for (int i = 0; i <=count; i++) {
			Row ro = sh.getRow(i);
			
			for (int j = 0; j < ro.getLastCellNum(); j++) {
				
				System.out.println(ro.getCell(j).getStringCellValue()+"");
			}
			//System.out.println();
		}
		
		}

	}


