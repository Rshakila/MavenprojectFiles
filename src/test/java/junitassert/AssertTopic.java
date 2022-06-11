package junitassert;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertTopic {
	
	@Test
	public void test1() {
		Assert.assertTrue(true);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Assert.assertTrue("verify url page", driver.getCurrentUrl().contains("facebook"));
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("sathyasaki");
		WebElement passwd = driver.findElement(By.name("pass"));
        passwd.sendKeys("rajendransaki");
        String s = passwd.getAttribute("value");
        Assert.assertEquals("facebook Home page", "rajendransaki",s);
        WebElement login = driver.findElement(By.name("login"));
        login.click();
        
	}
	

}
