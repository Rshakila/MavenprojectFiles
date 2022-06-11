package pojaAnnotations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SamplePojo {
	public SamplePojo() {
		PageFactory.initElements(driver, btnlogin);
	}
	private WebElement txtuser;
	private WebElement txtpaswd;
	private WebElement btnlogin;
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpaswd() {
		return txtpaswd;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
	
		
	

}
