package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {

	public static void main(String[] args) {
		System.setProperty("weddriver.chrome.driver", "./src/main/resources/chromedriver.exe");
           WebDriverManager.chromedriver().setup();
           WebDriver driver=new ChromeDriver();
           driver.get("https://www.myntra.com/");
	}

}
