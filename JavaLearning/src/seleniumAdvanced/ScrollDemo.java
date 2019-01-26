package seleniumAdvanced;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import seleniumBasics.BrowserHelper;

public class ScrollDemo {
	@Test
	public void scrollPageDown() throws Exception{
	
	BrowserHelper bhelp = new BrowserHelper();
	WebDriver driver = bhelp.startBrowser("chrome", "http://www.amazon.co.uk");
	
	Thread.sleep(3000);
	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	
	
	}

}
