package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManuallyRerun {
	@Test
	private void value1() {
		System.out.println("testcase1");
	}
	@Test
	private void value2() {
		Assert.assertTrue(false);
	}
	@Test
	private void value3() {
		System.out.println("testcase3");
	}

}
