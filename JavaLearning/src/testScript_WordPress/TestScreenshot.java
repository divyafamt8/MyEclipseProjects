package testScript_WordPress;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages_WordPress.LoginPage;
import seleniumBasics.BrowserHelper;
import seleniumBasics.ScreenShot;

public class TestScreenshot {
	
	@Test
	public void testScreenshotWordpress() throws Exception{
		BrowserHelper bhelp = new BrowserHelper();
		WebDriver driver = bhelp.startBrowser("chrome", "https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		
		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		 
		
		lp.enterUserName("rtwfdtwg");
		lp.clickOnSignInButton();
		
		ScreenShot.captureScreenshot(driver, "login");
		
		bhelp.tearDown();
	}

}
