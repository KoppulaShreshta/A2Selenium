package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Loginpage login=new Loginpage(driver);
		if(login.getPageHeader().equals("Login"))
			System.out.println("Login Success");
		else
			System.out.println("Login Failed");
		login.setUsername("admin");
		login.setPassword("admin");
		login.clickKeepMeLoggedInCB();
		login.clickLoginButton();
		Thread.sleep(3000);
		
			driver.close();
	}

}
