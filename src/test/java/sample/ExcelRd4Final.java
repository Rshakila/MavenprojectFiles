package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRd4Final {public static void main(String[] args) throws IOException {

	File excelloc=new File("C:\\Users\\User\\Desktop\\sathyasaki\\MavenProject2\\ExcelD\\saki.xlsx");
	//to convert file into java objects
		FileInputStream fln=new FileInputStream(excelloc);
	//To create workbook
		Workbook w=new XSSFWorkbook(fln);
		//to get sheet
		Sheet s = w.getSheet("SAKIFAIZ");
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
	    for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			
			int type = c.getCellType();
			
		}
		}
	

}
