package UtilityPKG;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Loginexel {
	
	@SuppressWarnings("resource")
	
	public static String getCellValue(String x1, String Sheet, int r, int c)
	
	{
		try
		
		{
			FileInputStream f1 = new FileInputStream(x1);
			XSSFWorkbook wb = new XSSFWorkbook(f1);
			
			XSSFCell cell = wb.getSheet(Sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				return cell.getRawValue();
			}
		}
		catch(Exception e)
		{
			return "";
		}
	}
	
	@SuppressWarnings("resource")
	public static int getRowCount (String x1, String Sheet)
	{
		try
		{
			FileInputStream f1 = new FileInputStream(x1);
			XSSFWorkbook wb = new XSSFWorkbook(f1);
			
				return wb.getSheet(Sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			return 0;
		}
	}

}
