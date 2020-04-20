package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel_read
{
	public static String getData(String sheet, int row, int cell) 
	{
		String val = "";
		try 
		{
			FileInputStream fis = new FileInputStream("./excel/data.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
			val = c.getStringCellValue();
			

		}
		catch (Exception e)
		{
			Reporter.log("Failed to read data from excel", true);
		}
		return val;
	}
}
