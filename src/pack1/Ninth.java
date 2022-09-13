package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ninth 
{
	public static void main(String[] args) throws IOException
	{
		//file locate-address
		String address ="C:\\Users\\Rohit\\Desktop\\Programme\\Book1.xlsx";
		
		//above location-one file-open and read	
		FileInputStream file = new FileInputStream(address);  //exception -accept it
		
		//workbook read
		XSSFWorkbook workbook = new XSSFWorkbook(file);    //exception -accept it
		
		//sheet read
		XSSFSheet sheet = workbook.getSheet("Work");
		
		//row read
		XSSFRow row = sheet.getRow(3);
		
		//cell read
		XSSFCell cell= row.getCell(1);
		
		//get the cell value now
		
		String userName =cell.getStringCellValue();
		System.out.println(userName);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
