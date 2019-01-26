package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;


public class BrowserHelper {
	
	
	 WebDriver driver;
	
	
	public WebDriver startBrowser(String browser,String url){
		if(browser=="chrome")
		{
			 driver = new ChromeDriver(); 
									
		}
		else if(browser=="firefox")
		{
			 driver = new FirefoxDriver();	
		}
		
		Reporter.log("==============Browser session started===========",true);
		driver.get(url);	
		
		return driver;
	}
	
	
	public void tearDown(){
		driver.quit();
		Reporter.log("============Browser session ended=====",true);
		
		//driver.close();
	}
	/*
	public static void main(String[] args) throws InterruptedException {
		BrowserHelper bhelp = new BrowserHelper();
		
		bhelp.startBrowser("chrome","http://www.amazon.uk");
		
		Thread.sleep(2000);
		
		//driver.manage().timeouts().implicitlyWait(arg0, arg1)
		
		bhelp.tearDown();
	}*/
	
}