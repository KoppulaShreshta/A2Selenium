package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
	//declaration
	@FindBy(xpath="//img[@alt='Google']")
	private WebElement googleImage;
	
	@FindBy(id="APjFqb")
	private WebElement searchTF;
	
	@FindBy(xpath="//div[@class='FPdoLc lJ9FBc']/descendant::input[@name='btnK']")
	private WebElement googlesearchButton;


      //Initialization
	public GooglePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//Utilization
	public WebElement getGoogleImage()
	{
		return googleImage;
	}
	public void setSearchTF(String search)
	{
		searchTF.sendKeys(search);
	}
	public void clicksearchBtn()
	{
		googlesearchButton.click();
	}
	
}