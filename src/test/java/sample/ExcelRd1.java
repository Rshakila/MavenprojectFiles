package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRd1 {
	public static void main(String[] args) throws IOException {
		File excelloc =new File("C:\\Users\\User\\Desktop\\sathyasaki\\MavenProject2\\ExcelD\\ssExcel.xlsx");
		FileInputStream f=new FileInputStream(excelloc);
		Workbook w=new XSSFWorkbook(f);
	Sheet s = w.getSheet("valuesfinder");
	Row r = s.getRow(1);
	Cell c = r.getCell(2);
	
	//how many rows and colm present in excelsheet
	int NoofRow = s.getPhysicalNumberOfRows();
	System.out.println(NoofRow);

	int NoOfCell = r.getPhysicalNumberOfCells();
	System.out.println(NoOfCell);
	}
	

}
