package testNG;

import org.testng.annotations.Test;

public class Program2 {
	@Test(priority=5)
	private void Test1() {
		System.out.println("Test 1");
	}
	@Test
	private void Test2() {
		System.out.println("Test 2");
	}
	@Test(priority=-10)
	private void Test3() {
		System.out.println("Test 3");
	}
	@Test(enabled=false)
	private void Test4() {
		System.out.println("Test 4");
	}
	@Test(priority=-3)
	private void Test5() {
		System.out.println("Test 5");
	}


}
