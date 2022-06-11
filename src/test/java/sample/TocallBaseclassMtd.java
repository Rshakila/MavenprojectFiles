package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TocallBaseclassMtd {
	public static void main(String[] args) {
		//to create object to baseclass
		BaseClass b=new BaseClass();
		WebDriver driver=b.launchBrowser();
		b.launchurl(driver, "https://www.facebook.com/");
		WebElement id = driver.findElement(By.id("email"));
		b.textuser(id, "angelsathyaaaaa@gmail.com");
		WebElement passwd = driver.findElement(By.name("pass"));
		b.textuser(passwd, "sathyasaki5");
		WebElement login = driver.findElement(By.name("login"));
		b.loginclk(login);
		driver.close();
		
	}
	

}
