package excepProgram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\User\\Desktop\\sathyasaki\\MavenProject2\\ExcelD\\Adactin.xlsx");
		FileInputStream in=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(in);
		Sheet s = w.getSheet("vacation");
		Row r = s.getRow(4);
		Cell c = r.getCell(3);
		System.out.println(c);
		
		Row r1 = s.getRow(2);
		Cell c1 = r1.getCell(2);
		System.out.println(c1);
		
		Row r2 = s.getRow(3);
		Cell c2 = r2.getCell(7);
		System.out.println(c2);
		
		Row r3 = s.getRow(3);
		Cell c3 = r3.getCell(0);
		System.out.println(c3);
		
		
		
	}

}
