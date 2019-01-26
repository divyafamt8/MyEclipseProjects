package headlessBrowserTesting;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumBasics.ScreenShot;

public class PhantomJSDemo {
	
	@Test
	public void verifyFacebookTitle() throws Exception{
		
		File src = new File("//Users/Divya/Downloads/phantomjs-2.1.1-macosx/bin");
		
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		
		
		WebDriver driver = new PhantomJSDriver(null);
		
		driver.get("http://www.facebook.com");
		
		
		ScreenShot.captureScreenshot(driver, "facebookpagetitle");
		
		
	}
	
}
