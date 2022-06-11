package excepProgram;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		File location=new File("C:\\Users\\User\\Desktop\\sathyasaki\\MavenProject2\\ExcelD\\NewFS.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet s = w.createSheet("NameList");
		Row r = s.createRow(3);
		Cell c = r.createCell(2);
		c.setCellValue("jumko foruta");
		FileOutputStream fout=new FileOutputStream(location);
		w.write(fout);
		System.out.println("finished");
	}

}
