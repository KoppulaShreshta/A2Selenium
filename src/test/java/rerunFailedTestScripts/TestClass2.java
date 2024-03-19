package rerunFailedTestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass2 {
	@Test
	public void demo1() {
		System.out.println("TestClass2-demo1");
	}
	@Test
	public void demo2() {
		System.out.println("TestClass2-demo2");
	}
	@Test
	public void demo3() {
		System.out.println("TestClass2-demo3");
		//Assert.fail();
	}

}
