package excelutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingToExcel {

	@SuppressWarnings("resource")
	//Method to write in excel
	public void wr_excel(int r, int c, String data) {
		//Declaring file name
		String filename = "src/test/resources\\Testdata\\exceloc.xlsx";
		//Declaring sheet name
		String sheetname = "Sheet1";
		File f = new File(filename);
		try {
			//Creating object for file input stream
			FileInputStream fis = new FileInputStream(f);
			//Creating object for workbook
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			//Creating object for sheet
			XSSFSheet sh = wb.getSheet(sheetname);
			//Creating object for row
			XSSFRow row = sh.createRow(r);
			//Creating object for file output stream
			FileOutputStream fos = new FileOutputStream(f);
			//Creating object for cell
			XSSFCell cell1 = row.createCell(c);
			//Passing the data to the corresponding cell
			cell1.setCellValue(data);
			//Writing in the excel
			wb.write(fos);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
