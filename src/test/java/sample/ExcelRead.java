package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {

	File excelloc=new File("C:\\Users\\User\\Desktop\\sathyasaki\\MavenProject2\\ExcelD\\ssExcel.xlsx");
	//to convert file into java objects
		FileInputStream fln=new FileInputStream(excelloc);
	//To create workbook
		Workbook w=new XSSFWorkbook(fln);
		//to get sheet
		Sheet s = w.getSheet("valuesfinder");
		//to get row
		Row r= s.getRow(1);
		//to get cell
		Cell c = r.getCell(1);
        System.out.println(c);
		
		
}
}