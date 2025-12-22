package testCases;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class LoginTest {
	WebDriver driver;
	@BeforeClass
	public void set()
	{
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test	
	public void testLoginHRM() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(1000);
		lp.setUserName("Admin");
		Thread.sleep(1000);
		lp.setPassword("admin123");
		Thread.sleep(1000);
		lp.clickButton();
		Thread.sleep(5000);
	}
	
}
