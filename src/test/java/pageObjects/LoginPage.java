package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	// Constructor;
 public	LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_User;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_LoginElement;
	
	//Action Methods
	public void setUserName(String username) {
		
		txt_User.sendKeys(username);
	}
    public void setPassword(String pwd) {
		
    	txt_password.sendKeys(pwd);

	}
    public void clickButton() {
		
    	btn_LoginElement.click();

	}


}
