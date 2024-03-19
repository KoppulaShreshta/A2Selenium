package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyBetweenMethods {
	@Test
	public void navigateToApp() {
	Reporter.log("navigate to app");
	
	}
	@Test(dependsOnMethods = "navigateToApp")
	public void loginToApp() {
		Reporter.log("loginToApp");
	}
	

}
