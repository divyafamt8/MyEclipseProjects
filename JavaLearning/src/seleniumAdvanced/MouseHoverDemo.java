package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import seleniumBasics.BrowserHelper;

public class MouseHoverDemo {
	
	@Test
	public void performMouseHover() throws Exception{
		
		BrowserHelper bhelp = new BrowserHelper();
		WebDriver driver = bhelp.startBrowser("chrome", "http://www.amazon.uk");
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='gw-desktop-herotator']/div/div/div/div[3]/a/i"));
		
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
	}

}
