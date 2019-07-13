package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class ReadExcel {
	
@Test
public static String[][] excelread(String ExcelName) throws IOException {
		XSSFWorkbook wBook = new XSSFWorkbook("./Data/"+ExcelName+".xlsx");
		XSSFSheet sheet = wBook.getSheet("EditLead");
		int rowscount = sheet.getLastRowNum();
		System.out.println(rowscount);
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(numberOfRows);
		int columns = sheet.getRow(0).getLastCellNum();
		System.out.println(columns);
		String[][] data = new String[rowscount][columns];
		for(int i=1;i<=rowscount;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<columns;j++) {
				XSSFCell column = row.getCell(j);
				data[i-1][j] = column.getStringCellValue();
			System.out.println(data);
			}
		}
		wBook.close();
		return data;

	}

}
