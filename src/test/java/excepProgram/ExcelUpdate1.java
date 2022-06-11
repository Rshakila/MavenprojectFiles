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

public class ExcelUpdate1 {public static void main(String[] args) throws IOException {
	File loc=new File("C:\\Users\\User\\Desktop\\sathyasaki\\MavenProject2\\ExcelD\\Adactin.xlsx");
	FileInputStream in=new FileInputStream(loc);
	Workbook w=new XSSFWorkbook(in);
	Sheet s = w.getSheet("vacation");
	Row r = s.getRow(4);
	Cell c = r.getCell(3);
	String s1 = c.getStringCellValue();
	if (s1.contains("FS hotel")) 
	{
		c.setCellValue("FathimaHotel");
	}
	FileOutputStream out=new FileOutputStream(loc);
	w.write(out);
	System.out.println("Updated");
		
	}
	
}
