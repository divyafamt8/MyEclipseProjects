package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUpApplication(){
		
		Reporter.log("===============Browser session started===============",true);
		
		
		driver = new ChromeDriver();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		
		Reporter.log("========Application started============",true);
		
		
	}
	
	@AfterMethod
	public void closeApplication(){
		
		driver.quit();
		
		Reporter.log("===========Browser Session Ended=========",true);
		
	}
	
	

}
