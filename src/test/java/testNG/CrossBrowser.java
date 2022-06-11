package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	public static WebDriver driver;
	@Parameters("browserName")
	
	@Test
	private void TestBrw(String bName) {
		if (bName.equalsIgnoreCase("Chrome")) {
			System.out.println("Chrome");
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			
		}
		else if (bName.equalsIgnoreCase("firefox")) {
			System.out.println("firefox");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		else if (bName.equalsIgnoreCase("IE")) {
			System.out.println("Internet Explorer");
			WebDriverManager.iedriver().setup();
		    driver=new InternetExplorerDriver();	
		}
		
		else {
			System.out.println("Invalid Manager");
		}
		
	}

}
