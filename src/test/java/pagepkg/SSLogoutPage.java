package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SSLogoutPage {
	
	WebDriver driver;
	
	@FindBy(xpath ="//*[@id=\"react-burger-menu-btn\"]")
	
	WebElement hamBurgerMenu;
	
	@FindBy(xpath = "//*[@id=\"logout_sidebar_link\"] ")
	
	WebElement logout;
	
	public SSLogoutPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickHamBurgerMenu()
	{
		//driver.navigate().back();
		
		//driver.navigate().back();

		//driver.navigate().back();

		driver.navigate().back();

		hamBurgerMenu.click();
	}
	public void clickLogout()
	{
		
		logout.click();
	}
	
	

}
