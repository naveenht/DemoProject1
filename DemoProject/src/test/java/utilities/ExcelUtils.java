package utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils 
{
	public static void main(String[] args)
	{
		try {
			getRowCount();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void getRowCount() throws Exception
	{

		
			String projectPath = System.getProperty("user.dir");
			XSSFWorkbook workbook = new XSSFWorkbook(projectPath+"\\Excel\\data.xlsx");
			XSSFSheet sheet=workbook.getSheet("Sheet1");

			int rc = sheet.getPhysicalNumberOfRows();
			System.out.println("No. of rows="+rc);

	
		
	}
}

