package headlessBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Verifytitle {
	
	
	@Test
	public void verifyFacebookTitle(){
		
		//HtmlUnitDriver does not support taking screenshots
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("http://www.facebook.com");
		
		String facebook_title = driver.getTitle();
		
		Assert.assertTrue(facebook_title.contains("Facebook"),"Title does not contain the term Facebook ");
		
		System.out.println("Title is : "+facebook_title);
		
		
	}

}
