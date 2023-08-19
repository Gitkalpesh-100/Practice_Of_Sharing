package corejavapractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.compress.harmony.pack200.NewAttribute.PassAttribute;
import org.apache.poi.xssf.usermodel.*;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		 
	    FileInputStream file = new FileInputStream("C:\\Users\\Kalpesh Patil\\Desktop\\ReadingData1.xlsx");
		 
	    XSSFWorkbook workbook = new XSSFWorkbook(file);
	    
	    XSSFSheet sheet = workbook.getSheet("Sheet1");//Providing sheet name
	    //XSSFSheet sheet = workbook.getSheetAt(0);
	    
	    int rowcount = sheet.getLastRowNum(); //returns row count
	    
	    
	    int colcount = sheet.getRow(0).getLastCellNum(); //returns column count
	    
	    for(int i=0;i<rowcount;i++) 
	    {
	    	XSSFRow currentrow = sheet.getRow(i);   //focuses on current row
	    
	        for(int j=0;j<colcount;j++)
	        {
	    	  String value =  currentrow.getCell(j).toString();       //to read value from a cell - toString is a generic method
	    	  System.out.print("                          " + value);
	        }
	        System.out.println();
	        
	        
	    }
	     
	}
/*Registration.xlsx - Read all values from this excel sheet and print in a tabular format and
	Pass the data to the application*/
}
