package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProgramTestNG {
	@BeforeClass
	private void beforelass() {
		System.out.println("launching");
	}
	@AfterMethod
	private void aftermtd() {
		System.out.println("end");
	}
	@BeforeMethod
    private void beforemtd() {
	System.out.println("start");
}
	@Test
	private void test() {
		System.out.println("test program");
	}
	@AfterClass 
	private void afterclass() {
		System.out.println("quit");
		

	}
		
	}

