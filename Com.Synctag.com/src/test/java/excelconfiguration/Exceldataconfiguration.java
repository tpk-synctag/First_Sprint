package excelconfiguration;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataconfiguration 
{

	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public Exceldataconfiguration()
	{
		File src=new File("./ApplicationData/ApplicationTestData.xlsx");
		
		try {
			FileInputStream fis =new FileInputStream(src);
			
			 wb=new XSSFWorkbook(fis);
			
			sheet=wb.getSheetAt(0);
		} 
		catch (Exception e)
		{
			System.out.println("The Exception is :"+e.getMessage());
			
		}
		
		
	}
	
	public String getdata(int sheetnumber,int row,int column)
	{
		
		String data=wb.getSheetAt(sheetnumber).getRow(row).getCell(column).getStringCellValue();
		return data;
				
	}
	
	public String getdata(String sheetname,int row,int column)
	{
		
		String data=wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		return data;
				
	}
	
	public int getrowcount(int sheetindex)
	{
		
		int row=wb.getSheetAt(sheetindex).getLastRowNum();
		
		row=row+1;
		return row;
		
	}
	
	
}
