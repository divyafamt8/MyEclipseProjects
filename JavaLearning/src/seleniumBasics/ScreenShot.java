package seleniumBasics;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import com.google.common.io.Files;

public class ScreenShot {

	@Test
	public static void captureScreenshot(WebDriver driver,String screenshotName) throws Exception{
		
	
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//FileUtils.CopyFile();
		
		Files.copy(src, new File("/Users/Divya/Eclipse_Projects/JavaLearning/Screenshots/"+screenshotName+".png"));
		//FileHandler.copy(src, new File("/Users/Divya/Eclipse_Projects/JavaLearning/Screenshots/WordPressScreenshot.png"));
		
		
		
	}
}
