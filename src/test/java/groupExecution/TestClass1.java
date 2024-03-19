package groupExecution;

import org.testng.annotations.Test;

public class TestClass1 {
	@Test(groups ="smoke")
	public void demo1() {
		System.out.println("TestClass1 - demo - smoke");
	}
	@Test(groups = "regression")
	public void demo2() {
		System.out.println("TestClass1 - demo2 - regression");
	}
	@Test(groups = {"smoke","regression"})
	public void demo3() {
		System.out.println("TestClass1 - demo3 - smoke and regression");
		

	}

}
