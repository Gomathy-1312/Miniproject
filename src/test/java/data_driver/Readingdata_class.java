package data_driver;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingdata_class {

	public static void main(String[] args) throws IOException {

		// 1) reading data from excel

		// Excel File

		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"/testdata/County base.xlsx");

		// WorkBook

		XSSFWorkbook workbook = new XSSFWorkbook(fi);

		// Sheets

		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int totalRows = sheet.getLastRowNum();  // row no

		int totalCells = sheet.getRow(0).getLastCellNum();  // cell no
		
		
		System.out.println("Row num"+totalRows);
		System.out.println("cell num"+totalCells);
		
		
		for(int r=0;r<=totalRows;r++)  // row
		{
			XSSFRow currentRow=sheet.getRow(r);
						
			for(int c=0;c<totalCells;c++)  // cell
			{
				XSSFCell cell=currentRow.getCell(c);
				System.out.print(cell.toString()+"\t");   // extract the cell value into string
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		

	}

}
