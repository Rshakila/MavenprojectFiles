package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelrd2 {
	public static void main(String[] args) throws IOException {

		File excelloc=new File("C:\\Users\\User\\Desktop\\sathyasaki\\MavenProject2\\ExcelD\\ssExcel.xlsx");
		//to convert file into java objects
			FileInputStream fln=new FileInputStream(excelloc);
		//To create workbook
			Workbook w=new XSSFWorkbook(fln);

			Sheet sheet = w.getSheet("valuesfinder");
			
			//iterate the value for using for loop
		
for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	Row r = sheet.getRow(i);
	
	
	for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
		Cell c = r.getCell(j);
		System.out.print(c+"\t");
	}
	System.out.println();
	
}
	
	
	}
	}
