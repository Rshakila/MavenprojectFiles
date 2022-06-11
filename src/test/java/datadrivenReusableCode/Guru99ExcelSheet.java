package datadrivenReusableCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.helper.DataUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru99ExcelSheet {
	public static WebDriver driver;
		
	public WebDriver brwlaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;	
	}
	public void url(String url) {
		driver.get(url);
		driver.manage().window().maximize();	
	}
	public void fillemail(WebElement element,String Data) {
		
	}
public void submit(WebElement element) {
element.click();

}
public String getTitle() {
	String title = driver.getTitle();
	return title;

}
public String dataread(String Snm,int Rnm,int Cnm) throws IOException {
	String value=null;
	File f=new File("C:\\Users\\User\\Desktop\\sathyasaki\\MavenProject2\\ExcelD\\saki.xlsx");
	FileInputStream fi=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fi);
	Sheet s = w.getSheet(Snm);
	
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row r = s.getRow(Rnm);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(Cnm);
			int type = c.getCellType();
			if (type==1) {
				 value = c.getStringCellValue();
			}
			if (type==0) {
			boolean b = DateUtil.isCellDateFormatted(c);
			
			if (b) {
				Date d = c.getDateCellValue();
				SimpleDateFormat sd=new SimpleDateFormat();
				 value = sd.format(d);
			}else {
				double dn = c.getNumericCellValue();
				long l=(long)dn;
				 value = String.valueOf(l);
				
				
			}
			
			}
			}
			
		}
	return value;
		
	}

}



