package datadrivenReusableCode;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GuruSample {
	public static void main(String[] args) throws IOException {
		Guru99ExcelSheet g=new Guru99ExcelSheet();
		WebDriver driver = g.brwlaunch();
		g.url("https://demo.guru99.com/");
		WebElement element = driver.findElement(By.name("emailid"));
		g.fillemail(element, g.dataread("SAKIFAIZ", 2, 2));
		WebElement element2 = driver.findElement(By.name("btnLogin"));
        g.submit(element2);
}
}