package testpkg;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.SSBaseClass;
import pagepkg.SSCartPage;
import pagepkg.SSCheckOutPage;
import pagepkg.SSLoginPage;
import pagepkg.SSLogoutPage;
import utilitiespkg.ExcelUtilities;

public class SSLoginTest extends SSBaseClass {
	
	@Test
	
	public void testLogin()
	{
		SSLoginPage login = new SSLoginPage(driver);
		
		String filePath = "F:\\Software Testing\\ExcelSheets\\SecretSauce.xlsx";
		
		String sheet = "Sheet1";
		
		int rowCount = ExcelUtilities.getRowCount(filePath, sheet);
		
		for(int i = 1; i <= rowCount; i++)
		{
			String username = ExcelUtilities.getCellValue(filePath, sheet, i, 0);
			
			String password = ExcelUtilities.getCellValue(filePath, sheet, i, 1);
			
			login.setValues(username, password);
			
			login.clickLoginButton();
			
			String expectedURL = "https://www.saucedemo.com/inventory.html";
			
		    String actualURL = driver.getCurrentUrl();
			
			//Assert.assertEquals(expectedURL, actualURL);
		    
		    if(expectedURL.equalsIgnoreCase(actualURL))
		    {
		    	System.out.println("Login successful");
		    }
		    else
		    {
		    	System.out.println("Login failed");
		    	
		    }
		    
		}
		
		SSCartPage cart = new SSCartPage(driver);
		
		cart.addToCart();
		
		cart.clickCartButton();
		
		cart.clickCheckOut();
		
		
		SSCheckOutPage checkout = new SSCheckOutPage(driver);
				
		checkout.setCheckoutInfo("abcd", "efgh", "6789");
		
		checkout.clickContinue();
		
		SSLogoutPage logout = new SSLogoutPage(driver);
		
		logout.clickHamBurgerMenu();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		logout.clickLogout();

	}

}
