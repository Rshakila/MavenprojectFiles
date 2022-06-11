package datadrivenReusableCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadReusableCode {
	public WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 return driver;
			}
		public void launchurl(WebDriver driver,String url) {
			driver.get(url);
			driver.manage().window().maximize();

		}
		public void textuser(WebElement element,String id) {
		element.sendKeys(id);
		}
		public void loginclk(WebElement element) {
			element.click();
		}
		public void BwsrClose(WebDriver driver) {
			driver.close();
			
		}
			public String dataReadFromExcel(String sname,int rno,int cno) throws IOException{
				String value=null;
				File f=new File("C:\\Users\\User\\Desktop\\sathyasaki\\MavenProject2\\ExcelD\\Adactin.xlsx");
				FileInputStream fi=new FileInputStream(f);
				Workbook w=new XSSFWorkbook(fi);
				Sheet s = w.getSheet(sname);
				for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
				Row r = s.getRow(rno);
				for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
					Cell c = r.getCell(cno);
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
							double numeric = c.getNumericCellValue();
							long l=(long)numeric;
							 value = String.valueOf(1);
						}
							
						
						
					}
				}}
			
return value;
			}
	
}
	
			
				
