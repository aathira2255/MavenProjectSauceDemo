package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SSCartPage {
	
	WebDriver driver;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	
	WebElement backpack;
	
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	
	WebElement bikeLight;
	
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	
	WebElement tShirt;

	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")

	WebElement jacket;
	
	@FindBy(id = "add-to-cart-sauce-labs-onesie")

	WebElement infantDress;
	
	@FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")

	WebElement tShirtRed;
	
	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
	
	WebElement cartIcon;
	
	@FindBy(xpath = "//*[@id=\"checkout\"]")
	
	WebElement checkOutButton;
	
	public SSCartPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void addToCart()
	{
		backpack.click();
		
		bikeLight.click();
		
		tShirt.click();
		
		jacket.click();
		
		infantDress.click();
		
		tShirtRed.click();
	}
	
	public void clickCartButton()
	{
		cartIcon.click();
	}
	
	public void clickCheckOut()
	{
		checkOutButton.click();
	}

	
}
