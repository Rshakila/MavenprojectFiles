package datadrivenReusableCode;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample {
	public static void main(String[] args) throws IOException {
		//DataDriven
	ReadReusableCode r=new ReadReusableCode();
	WebDriver driver=r.launchBrowser();
	r.launchurl(driver, "https://www.facebook.com/");
	WebElement user = driver.findElement(By.id("email"));
	r.textuser(user, r.dataReadFromExcel("vacation", 3, 0));
	WebElement pass = driver.findElement(By.id("pass"));
	r.textuser(pass, r.dataReadFromExcel("vacation", 4, 3));
	WebElement login = driver.findElement(By.name("login"));
	r.loginclk(login);
	
}
}