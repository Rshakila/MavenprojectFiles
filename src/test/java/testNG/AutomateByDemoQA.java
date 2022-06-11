package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateByDemoQA {
	@Parameters({"firstName","lastName","userEmail","userNumber"})
	@Test
	private void RegistrationForm(String a1,String a2,String a3,String a4) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement FName = driver.findElement(By.id("firstName"));
		FName.sendKeys(a1);
		WebElement LName = driver.findElement(By.id("lastName"));
		LName.sendKeys(a2);
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys(a3);
		WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
		Select s=new Select(gender);
		gender.click();
		s.selectByVisibleText("Female");
		WebElement num = driver.findElement(By.id("userNumber"));
		num.sendKeys(a4);
		
		WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
		Select s2=new Select(dateOfBirthInput);
		dateOfBirthInput.click();
		s2.selectByVisibleText("May");
		
		driver.findElement(By.xpath("//div[@class='subjects-auto-complete__control css-yk16xz-control']"));
		
		
		
		
		
		
		
	}

}
