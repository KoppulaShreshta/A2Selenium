package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeSuite
	public void suiteConfig() {
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void testConfig() {
		System.out.println("Before Test");
	}
	@BeforeClass
	public void classConfig() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void methodConfig() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void methodTeardown() {
		System.out.println("After Method");
	}
	@AfterClass
	public void classTeardown() {
		System.out.println("After class");
	}
	@AfterTest
	public void testTeardown() {
		System.out.println("After Test");
	}
	@AfterSuite
	public void suiteTeardown() {
		System.out.println("After suite");
	}
	

}
