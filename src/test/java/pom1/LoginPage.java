package pom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	// Step1  Constructor
	
	WebDriver driver;

	LoginPage(WebDriver driver) {

		
		this.driver=driver;
		
	}
	
	
	// Locators
	
//	driver.findElement        (By.xpath("//input[@placeholder='Username']").sendkeys("ascvh")
	By username =By.xpath("//input[@placeholder='Username']");
	By password = By.xpath("//input[@placeholder='Password']");
	By login = By.xpath("//button[normalize-space()='Login']");
	
	
	// Actions
	
	

	public void setUserName(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	
	
	public void setPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickLogin()
	{
		driver.findElement(login).click();
	}
	
	
	
	
	
	
	
	

}
