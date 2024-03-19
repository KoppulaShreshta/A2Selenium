package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	
		//Declaration
		@FindBy(xpath="//h3[text()='Login']")
		private WebElement pageHeader;
		
		@FindBy(id="email")
		private WebElement usernameTF;
		
		@FindBy(name="password")
		private WebElement passwordTF;
		
		@FindBy(id="keepLoggedInCheckBox")
		private WebElement keepmeloggedinCB;
		
		@FindBy(className="Forgot")
		private WebElement forgotPwdLink;
		
		@FindBy(name="login")
		private WebElement loginButton;
		
		//Initialization
		public Loginpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//Utilization
		public String getPageHeader()
		{
			return pageHeader.getText();
		}
		public void setUsername(String username)
		{
			usernameTF.sendKeys(username);
		}
		public void setPassword(String password)
		{
			passwordTF.sendKeys(password);
		}
		public void clickKeepMeLoggedInCB()
		{
			keepmeloggedinCB.click();
		}
		public void clickForgotPwdLink()
		{
			forgotPwdLink.click();
		}
		public void clickLoginButton()
		{
			loginButton.click();
		}
		
		

}
