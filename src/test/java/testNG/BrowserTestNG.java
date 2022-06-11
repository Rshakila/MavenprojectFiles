package testNG;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTestNG {
	@Test
	private void TestNG() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("\"https://www.facebook.com/");
		driver.manage().window().maximize();


		Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("shakila");
		WebElement pass = driver.findElement(By.id("pass"));
	    pass.sendKeys("sathya55");
	    
	   Assert.assertEquals(pass.getAttribute("value"),"sathyasaki", "verify password");
	    WebElement login = driver.findElement(By.name("login"));
		login.click();
	
	}
}
