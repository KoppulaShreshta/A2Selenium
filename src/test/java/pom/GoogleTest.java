package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		GooglePage page=new GooglePage(driver);
		if(page.getGoogleImage().isDisplayed())
			System.out.println("Google Is Displayed");
		else
			System.out.println("Google Is  Not Displayed");
		page.setSearchTF("selenium");
		page.clicksearchBtn();
		Thread.sleep(4000);
		driver.close();

	}

}
