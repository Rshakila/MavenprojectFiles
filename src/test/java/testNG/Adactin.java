package testNG;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin {
	@Parameters({"Username","Password","Check In Date","Check Out Date","first_name","last_name","address","cc_num","cc_cvv"})
	@Test
	private void loginpage(String a1,String a2,String a3,String a4,String a5,String a6,String a7,String a8,String a9) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(a1);
		WebElement 
		pass = driver.findElement(By.id("password"));
		pass.sendKeys(a2);
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		WebElement location = driver.findElement(By.id("location"));
		Select s=new Select(location);
		location.click();
		s.selectByVisibleText("Brisbane");
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1=new Select(hotel);
		hotel.click();
		s1.selectByVisibleText("Hotel Hervey");
		
		WebElement Roomtype = driver.findElement(By.id("room_type"));
		Select s2=new Select(Roomtype);
		Roomtype.click();
		s2.selectByVisibleText("Deluxe");
		WebElement checkIn = driver.findElement(By.name("datepick_in"));
		checkIn.sendKeys(a3);
		
		WebElement checkOut = driver.findElement(By.name("datepick_out"));
		checkOut.sendKeys(a4);
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
	
		WebElement btn = driver.findElement(By.id("radiobutton_0"));
		btn.click();
		WebElement cont = driver.findElement(By.id("continue"));
	    cont.click();
	    WebElement firstn = driver.findElement(By.name("first_name"));
	    firstn.sendKeys(a5);
	    
	    WebElement lastname = driver.findElement(By.name("last_name"));
	    lastname.sendKeys(a6);
	    
	    WebElement address = driver.findElement(By.name("address"));
	    address.sendKeys(a7);
	      
	    WebElement creditcard = driver.findElement(By.name("cc_num"));
	    creditcard.sendKeys(a8);
	    
	    WebElement creditType = driver.findElement(By.name("cc_type"));
	    Select s3=new Select(creditType);
	    creditType.click();
		s3.selectByVisibleText("Master Card");
		WebElement Emonth = driver.findElement(By.name("cc_exp_month"));
	    Select s4=new Select(Emonth);
	    Emonth.click();
	    s4.selectByVisibleText("May");
	    
	    WebElement Eyear = driver.findElement(By.id("cc_exp_year"));
	    Select s5=new Select(Eyear);
	    Eyear.click();
	    s5.selectByVisibleText("2022");
	    
	    WebElement cvvNo = driver.findElement(By.name("cc_cvv"));
	    cvvNo.sendKeys(a9);
	    WebElement Booknow = driver.findElement(By.id("book_now"));
	    Booknow.click();
	    System.out.println(Booknow);
	    WebElement d = driver.findElement(By.id("order_no"));
	    System.out.println();
	}

}
