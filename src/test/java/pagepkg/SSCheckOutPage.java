package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SSCheckOutPage {
	
	WebDriver driver;

	@FindBy(id = "first-name")
	
	WebElement firstName;
	
	@FindBy(id = "last-name")
	
	WebElement lastName;
	
	@FindBy(xpath = "//*[@id=\"postal-code\"]")
	
	WebElement SSZipCode;
	
	@FindBy(xpath = "//*[@id=\"continue\"]")
	
	WebElement continueButton;
	
	public SSCheckOutPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void setCheckoutInfo(String fName, String lName, String zipCode)
	{
		firstName.sendKeys(fName);
		
		lastName.sendKeys(lName);
		
		SSZipCode.sendKeys(zipCode);
	}
	
	public void clickContinue()
	{
		continueButton.click();
	}
	
	
}
