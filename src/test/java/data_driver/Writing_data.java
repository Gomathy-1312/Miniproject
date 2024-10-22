package data_driver;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_data {

	public static void main(String[] args) throws IOException {

		// Writing process

		FileOutputStream fi  = new FileOutputStream(System.getProperty("user.dir") + "/testdata/NewData.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet("NewData"); // create empty excel sheet with name of Data

		XSSFRow row1 = sheet.createRow(0); // row 0
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue(19);
		row1.createCell(2).setCellValue("Automation");

		XSSFRow row2 = sheet.createRow(1); // row 1
		row2.createCell(0).setCellValue("Selenium");
		row2.createCell(1).setCellValue(20);
		row2.createCell(2).setCellValue("Automationplus");

		XSSFRow row3 = sheet.createRow(2); // row 2
		row3.createCell(0).setCellValue("Selenide");
		row3.createCell(1).setCellValue(40);
		row3.createCell(2).setCellValue("Javaprogram");
		
		workbook.write(fi);
		workbook.close();
		fi.close();

		System.out.println("File is creataed.fi....");

		
		

	}

}
