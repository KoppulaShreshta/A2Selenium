package groupExecution;

import org.testng.annotations.Test;

public class Testclass4 {
	@Test(groups ={"smoke","sanity","regresssion"})
	public void demo1() {
		System.out.println("Testclass4-demo1-smoke,sanity and regression");
	}
	@Test
	public void demo2() {
		System.out.println("Testclass4-demo2-no groups");
	}
	
	

}
