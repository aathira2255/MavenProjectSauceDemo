package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SSLoginPage {
	
	WebDriver driver;
	
	@FindBy(id = "user-name")
	
	WebElement ssUserName;
	
	@FindBy(id = "password")
	
	WebElement ssPassword;
	
	@FindBy(id = "login-button")
	
	WebElement ssLoginButton;
	
	public SSLoginPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void setValues(String username, String password)
	{
		ssUserName.clear();
		
		ssUserName.sendKeys(username);
		
		ssPassword.clear();
		
		ssPassword.sendKeys(password);
	}

	public void clickLoginButton()
	{
		ssLoginButton.click();
	}
}
