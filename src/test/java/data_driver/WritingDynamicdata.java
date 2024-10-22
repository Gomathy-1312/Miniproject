package data_driver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicdata {

	public static void main(String[] args) throws Exception {

		FileOutputStream fi = new FileOutputStream(System.getProperty("user.dir") + "/testdata/Dynamic.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet("Dynamic");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number into excel row data");
		int noofrows = sc.nextInt();

		System.out.println("Enter number into excel cell data");
		int noofcell = sc.nextInt();

		for (int r = 0; r <= noofrows; r++) { // row

			XSSFRow currentRow = sheet.createRow(r);

			for (int c = 0; c <= noofrows; c++) { // cell // java

				XSSFCell cell = currentRow.createCell(c);
				cell.setCellValue(sc.next());
			}
		}

		workbook.write(fi); // attach workbook to the file
		workbook.close();
		fi.close();

		System.out.println("File is creataed.....");

	}

}
