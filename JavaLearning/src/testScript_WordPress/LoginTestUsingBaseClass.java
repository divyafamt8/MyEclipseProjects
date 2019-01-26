package testScript_WordPress;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages_WordPress.LoginPage;
import seleniumBasics.BaseClass;

public class LoginTestUsingBaseClass extends BaseClass{
	
	@Test(description="This TC will perform valid login")
	public void validLogin(){
         
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		 
		
		loginpage.enterUserName("opensourcecms");
		loginpage.enterPassword("opensourcecms");
		loginpage.clickOnSignInButton();
		
	}
	
	@Test(description="This TC will test with Invalid login credentials")
	public void invalidLogin() throws Exception{
		try{
		
       LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		 
		
		loginpage.enterUserName("opensourcecms323423");
		loginpage.enterPassword("opensourc");
		loginpage.clickOnSignInButton();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
