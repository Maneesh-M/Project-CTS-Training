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
		String filename = "src/test/resources\\Testdata\\exceloc.xlsx";
		String sheetname = "Sheet1";
		File f = new File(filename);
		try {
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheetname);
			XSSFRow row = sh.createRow(r);
			FileOutputStream fos = new FileOutputStream(f);
			XSSFCell cell1 = row.createCell(c);
			cell1.setCellValue(data);
			wb.write(fos);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
