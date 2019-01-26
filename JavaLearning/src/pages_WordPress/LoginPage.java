package pages_WordPress;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	 WebDriver driver;
	
	@FindBy(how = How.ID, using ="user_login")
	WebElement userName;
	

	@FindBy(how=How.XPATH, using =".//*[@id='user_pass']")
	WebElement password;
	
	@FindBy(how = How.ID, using = "wp-submit")
	WebElement signInButton;
	

	//Constructor
	public LoginPage(WebDriver ldriver){
		this.driver = ldriver;
	
	}
	
	public void enterUserName(String uname){
		
	 userName.sendKeys(uname);
		
	}
	
	public void enterPassword(String pwd){
		password.sendKeys(pwd);
		
	}
	
	public void clickOnSignInButton(){
		signInButton.click();
	}
	
	
}
