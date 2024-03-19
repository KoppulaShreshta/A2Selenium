package crossBrowserParallel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	
	@Parameters("Browser")
	@BeforeClass
	public void classsetup(String browser) {
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
        case "edge":
        	WebDriverManager.edgedriver().setup();
        	driver=new EdgeDriver();
        	break;
		default:
			System.out.println("Invalid Browser info");
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@AfterClass
	public void classTearDown() {
		driver.quit();
	}

}
