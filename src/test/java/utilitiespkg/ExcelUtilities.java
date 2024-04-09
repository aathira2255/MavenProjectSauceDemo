package utilitiespkg;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	
	public static String getCellValue(String filePath, String Sheet, int rowDetails, int coloumnDetails)
	{
		
		try
		{
			FileInputStream file = new FileInputStream(filePath);	
		
			XSSFWorkbook workbook = new XSSFWorkbook(file);
		
			XSSFCell cell = workbook.getSheet(Sheet).getRow(rowDetails).getCell(coloumnDetails);
		
			if(cell.getCellType() == CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				return cell.getRawValue();
			}
			
		}catch(Exception e)
		{
			return "";
		}
	}
	
	public static int getRowCount(String filePath, String sheet)
	{
		try
		{
			FileInputStream file = new FileInputStream(filePath);
		
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			
			return workbook.getSheet(sheet).getLastRowNum();
		
		}catch(Exception e)
		{
			return 0;
		}
	}
		

}
