package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Eighth 
{
	public static void main(String[] args) throws IOException 
	{
		String Path="C:\\Users\\Rohit\\Desktop\\Programme\\Book1.xlsx";
		FileInputStream file=new FileInputStream(Path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Work");
//		XSSFRow row = sheet.getRow(i);
//		XSSFCell cell=row.getCell(j);
//		String Firstname=cell.getStringCellValue();
//		System.out.println(Firstname);
//		XSSFRow row1 = sheet.getRow(0);
//		XSSFCell cell1=row1.getCell(1);
//		String Lastname=cell1.getStringCellValue();
////		System.out.println(Lastname);
//		
//		XSSFRow row2 = sheet.getRow(0);
//		XSSFCell cell2=row2.getCell(2);
//		double Num=cell2.getNumericCellValue();
//		System.out.println(Firstname+" "+Lastname+" "+Num);
		int rowcount=sheet.getLastRowNum();
//		System.out.println(rowcount);
		int cellcount=sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<=rowcount;i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<cellcount;j++)
			{
				String value=row.getCell(j).toString();
				System.out.println(" "+value);
				
			}
			System.out.println();
		}
			 
				
		}
	}


