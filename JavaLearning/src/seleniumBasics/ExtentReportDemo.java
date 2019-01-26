package seleniumBasics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {
private static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		
		// start reporters
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("/Users/Divya/Eclipse_Projects/JavaLearning/test-output/extent.html");
    
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        

		BrowserHelper bhelp = new BrowserHelper();
			driver = bhelp.startBrowser("chrome","http://www.google.co.uk");
			
			test.info("Browser started");
			
		
		driver.findElement(By.name("q")).sendKeys("search");
		    test.info("Captured screenshot");
		
			ScreenShot.captureScreenshot(driver, "ScreenCapture");
			test.info("test completed");
			
			driver.close();
			driver.quit();
			
			test.info("Browser closed");
			
			extent.flush();
			
		
			
			
		

	}

}
