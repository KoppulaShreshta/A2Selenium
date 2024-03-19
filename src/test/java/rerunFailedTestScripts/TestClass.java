package rerunFailedTestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
@Test(retryAnalyzer =rerunFailedTestScripts.RetryImplementation.class)
public void demo() {
	System.out.println("Demo");
	Assert.fail();
}

}
