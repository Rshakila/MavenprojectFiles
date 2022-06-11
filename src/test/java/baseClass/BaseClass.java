package baseClass;

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
	public void launchUrl(WebDriver driver, String Url) {
		driver.get(Url);
		driver.manage().window().maximize();

	}
	public void fill(WebElement ele,String data) {
		ele.sendKeys(data);
	
	}
	public void btnclick(WebElement ele) {
         ele.click();
	}
	public void closeBrw(WebDriver driver) {
		driver.close();
		
	}
}
