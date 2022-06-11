package datadrivenReusableCode;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class DDSample2 {
	public static void main(String[] args) throws IOException {
	DDUpdate d=new DDUpdate();
	WebDriver driver = d.launchBrowser();
	d.launchurl("https://www.facebook.com/");
   String title = d.getTitle();
   d.excelUpdate("vacation", 2, 3, title);
	}

}
