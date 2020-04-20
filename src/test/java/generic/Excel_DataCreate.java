package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel_DataCreate {
	public static void WriteData(String sheet, int row, int cell, String val) {
		try {
			FileInputStream fis = new FileInputStream("./excel/data.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Cell c = wb.getSheet(sheet).createRow(row).createCell(cell);
			c.setCellValue(val);

			FileOutputStream fos = new FileOutputStream("./excel/data.xlsx");
			wb.write(fos);
		} catch (Exception e)
		{

			Reporter.log("Failed to create data in excel",true);
		}
	}
}
