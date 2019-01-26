package seleniumAdvanced;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverDemo {

	public static void main(String[] args) {
		//this manager will download the latest driver - no need for separate downloads of drivers
		
				WebDriverManager.firefoxdriver().setup();
				WebDriver driver = new FirefoxDriver();
				driver.get("http://www.amazon.co.uk");
				driver.quit();


	}

}
