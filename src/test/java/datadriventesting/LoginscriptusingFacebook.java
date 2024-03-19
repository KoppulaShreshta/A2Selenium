package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginscriptusingFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getData("url"));
		long time=Long.parseLong(getData("timeouts"));
		driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(time));
		driver.findElement(By.id("email")).sendKeys(getData("username"));
		driver.findElement(By.id("pass")).sendKeys(getData("password"));
		driver.findElement(By.name("login")).click();
		
		if (driver.getCurrentUrl().contains("facebook")) {
			System.out.println("login success");
			
		}
		else 
			System.out.println("failed");
		driver.close();

	}
	public static String getData(String key)
	{
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("./src/test/resources/facebook.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties property=new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return property.getProperty(key);

	}

}
