package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroupMethod {
	
	@Test(groups="Regg")
	private void FacebookUser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("sathaya");
	}
	@Test(groups="smoke")
	private void User2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("faisal");
	}
	@Test(groups="sanity")
	private void user3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Ashukutty");
	}
	
}
