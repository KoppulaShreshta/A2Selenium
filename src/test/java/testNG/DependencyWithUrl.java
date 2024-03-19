package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependencyWithUrl {
	@Test
	public void navigateToApp() {
		
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		WebElement header=driver.findElement(By.xpath("//h3[text()='Login']"));
		if(header.getText().contains("Login"))
			System.out.println("test pass");
		else
			System.out.println("test fail");
		driver.close();
	}
	@Test(dependsOnMethods = "navigateToApp")
	public void loginToApp()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		WebElement adminIcon = driver.findElement(By.xpath("//span[text()='SkillRary Admin']"));
		if(adminIcon.isDisplayed())
			System.out.println("login success");
		else
			System.out.println("login fail");
		driver.close();
		
		
		
	}

}
