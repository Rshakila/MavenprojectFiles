package junitassert;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartJunit {
	
	@BeforeClass
	public static void FlipkartBrowser() {
		System.out.println("FlipKart Shopping");
	}
	@AfterClass
	public static void end() {
		System.out.println("End Browser");
		
		
	}
	@Before
	public void BWStart() {
		System.out.println("Start browser launching");
		
	}
	@Test
	public void flipkartlogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement userid = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		userid.sendKeys("sathyasaki");
		WebElement passwd = driver.findElement(By.xpath("//input[@type='password']"));
		passwd.sendKeys("sakifaiz@55");	
	}

}
