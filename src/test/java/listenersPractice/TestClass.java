package listenersPractice;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listenersPractice.ListenerImplementation.class)
public class TestClass extends BaseClasss{
@Test
public void testMethod() {
	System.out.println("@Test");
}
}
