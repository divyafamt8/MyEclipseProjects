package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	private WebDriver driver = null;
	
	@BeforeTest
	public void setUp(){
		String dirpath = System.getProperty("user.dir");
		
		System.getProperty("webdriver.chrome.driver",dirpath+"/resources/drivers");
		
		driver = new ChromeDriver();
		
		
		
		
	}
	
	@Test(dataProvider = "test1")
	public void test1(String userName,String passWord) throws InterruptedException{
		
		System.out.println(userName+"  |  "+passWord);
		
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(userName);
		
		driver.findElement(By.id("pass")).sendKeys(passWord);
		
		Thread.sleep(2000);
		
		
		driver.close();
		
		
		
	}
	
	@DataProvider(name = "test1")
	public Object[][] getData(){
		String path = System.getProperty("user.dir");
		Object[][] data = testData(path+"/excel/data.xlsx", "sheet1");
		
		return data;
	}
	
	public static Object[][] testData(String pathName,String sheetName ){
		
		ExcelUtils excel = new ExcelUtils(pathName,sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++){
			for(int j=0;j<colCount;j++){
				String cellData = excel.getCellDataString(i, j);
				
				//System.out.print(cellData+" | ");
				
				data[i-1][j] = cellData;
			
			}
			
		}
		return data;
			
		
	}

}
