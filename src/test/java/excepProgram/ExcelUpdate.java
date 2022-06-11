package excepProgram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {
public static void main(String[] args) throws IOException {
	
File excelloc=new File("C:\\Users\\User\\Desktop\\sathyasaki\\MavenProject2\\ExcelD\\saki.xlsx");
	//to convert file into java objects
		FileInputStream fln=new FileInputStream(excelloc);
	//To create workbook
		Workbook w=new XSSFWorkbook(fln);
		//to get sheet
		Sheet s = w.getSheet("SAKIFAIZ");
		//to get  row and column
		Row r= s.getRow(3);
		Cell c = r.getCell(1);
		String rc = c.getStringCellValue();
		if (rc.contains("MBA"))
		{
			c.setCellValue("BA-aggri");
	
		}
		
		FileOutputStream fout=new FileOutputStream(excelloc);
		w.write(fout);
		System.out.println("Done the work");
}
}