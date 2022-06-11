package baseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample {
	public static void main(String[] args) {
		BaseClass b= new BaseClass();
		WebDriver driver = b.launchBrowser();
    b.launchUrl(driver,"https://www.facebook.com/");		
		WebElement textid  = driver.findElement(By.id("email"));
	b.fill(textid, "sakifa");
		WebElement textpass = driver.findElement(By.id("pass"));
	b.fill(textpass, "978e838");
		WebElement login = driver.findElement(By.name("login"));
    b.btnclick(login);
    b.closeBrw(driver);
	}

}
