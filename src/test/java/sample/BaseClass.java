package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
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
	

}
