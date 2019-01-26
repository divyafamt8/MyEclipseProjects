package testScript_WordPress;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages_WordPress.LoginPage;
import seleniumBasics.BrowserHelper;




public class TestWordPress {
	
	
	@Test
	public void testWPLoginPage(){
		
	
		
		
		
		BrowserHelper bhelp = new BrowserHelper();
		WebDriver driver = bhelp.startBrowser("chrome", "https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		 
		
		loginpage.enterUserName("opensourcecms");
		loginpage.enterPassword("opensourcecms");
		loginpage.clickOnSignInButton();
		
		String title = driver.getTitle();
		
        WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.titleIs(title));
		
		String expectedTitle = "Dashboard ‹ happy life for happy family — WordPress";
		
		Assert.assertEquals(title, expectedTitle,"Titles are not matching");
		
			System.out.println("successfully navigated to HomePage");
		
		bhelp.tearDown();
		
	}
	

}
