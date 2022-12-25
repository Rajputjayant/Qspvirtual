import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	
	//Identify  Testcases column by scanning the entire 1st row 
	// once column is indentified then scan entire test cases column to identify purchase test cases row
	// after you grab purchase test cases row = pull all the data of that row  and feed into test

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Book5.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets = workbook.getNumberOfSheets();
		for(int i =0; i< sheets; i++)
		{
			if (workbook.getSheetName(i).equalsIgnoreCase("Sheet1"))
	      	{		
			  XSSFSheet sheet= workbook.getSheetAt(i);
			//Identify  Testcases column by scanning the entire 1st row 
			  
			  Iterator<Row> rows = sheet.iterator();// sheet is collection of rows 
			  Row firstrow = rows.next();
			  Iterator<Cell> ce = firstrow.cellIterator();// row is collection of cells
			  int k=0;
			  int column = 0;
			  while(ce.hasNext())
			  {
				  Cell value = ce.next();
				  if(value.getStringCellValue().equalsIgnoreCase("Testcases"))
				  {
					  //desired column
					  column=k;
				  }
				  k++;
			  }
			  System.out.println(column);
			// once column is indentified then scan entire test cases column to identify purchase test cases row
			  
		    }
		}
			
		

	}

}
