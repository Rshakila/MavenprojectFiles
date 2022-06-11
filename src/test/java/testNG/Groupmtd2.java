package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Groupmtd2 {
	@Test(groups="sanity")
	private void facebookPassword() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys("sa@143");
	}
	@Test(groups="Regg")
   private void pass2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys("sathya@123");
}
	@Test(groups="smoke")
	   private void pass3() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement Password = driver.findElement(By.id("pass"));
			Password.sendKeys("faiz@555");
	}
}
