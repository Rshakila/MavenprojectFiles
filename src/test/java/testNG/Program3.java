package testNG;
import org.testng.annotations.Test;

public class Program3 {
	@Test
	private void Data1() {
		System.out.println("Test 1");
	}
	@Test(invocationCount=3)
	private void Data2() {
		System.out.println("Test 2");
	}
	@Test
	private void Data3() {
		System.out.println("Test 3");
	}

}
