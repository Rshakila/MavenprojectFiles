package sample;


import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitConcept {
	//jUnit annotations
@Before
public void start() {
	Date d =new Date();
	System.out.println(d);
}
@BeforeClass
public static void launcher() {
	System.out.println("the Browser start to launching");	
}

@AfterClass
public static void closeBrowser() {
	System.out.println("close the browser");
}
@After
public void close() {
	Date f=new Date();
	System.out.println(f);
}	
@Test
	public void launchUrl() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement id = driver.findElement(By.id("email"));
id.sendKeys("sathyasaki");
   WebElement passwd = driver.findElement(By.name("pass"));
 passwd.sendKeys("faisal555");
	WebElement login = driver.findElement(By.name("login"));
   login.click();
}
	
}
