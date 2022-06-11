package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRd3 {
	public static void main(String[] args) throws IOException {

		File excelloc=new File("C:\\Users\\User\\Desktop\\sathyasaki\\MavenProject2\\ExcelD\\saki.xlsx");
		//to convert file into java objects
			FileInputStream fln=new FileInputStream(excelloc);
		//To create workbook
			Workbook w=new XSSFWorkbook(fln);
			//to get sheet
			Sheet s = w.getSheet("SAKIFAIZ");
			//to get perticular row and colum
			Row r= s.getRow(2);
			Cell c = r.getCell(3);
	        System.out.println(c);
	        
	        int type = c.getCellType();
	        System.out.println(type);
	  
            int rowIndex = c.getRowIndex();
            System.out.println(rowIndex);
	
	
	}
	
}