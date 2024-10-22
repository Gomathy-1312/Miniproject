package TestNG_EX;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_providerex {

	WebDriver driver;

	@BeforeClass
	void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test(dataProvider="dp")
	void testlogin(String email,String password) {

		driver.get("https://tutorialsninja.com/demo/index.php?route=account/account");

		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();

		if (status == true) {

			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);

		} else {

			Assert.fail();

		}

	}

	@AfterClass
	void teardown() {

		driver.close();

	}
	
	
	
	
@DataProvider(name="dp")
	Object[][] testdata() {
	   
	   
	   Object data[][]	= {
			   
			   {"abc@gmail.com", "test123"},
				{"xyz@gmail.com", "test012"},
				{"john@gmail.com", "test@123"},
				{"gomathykrishnan13@gmail.com", "Gomathy@123"},
				{"johncanedy@gmail.com", "test"},
			   
			  }   ;
	   
	   return data;
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }

}
