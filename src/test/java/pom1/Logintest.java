package pom1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Logintest {

	WebDriver driver;

	@BeforeClass
	void setup() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

	}

	@Test
	void testlogin() {

		LoginPage lp = new LoginPage(driver);   // Constructor

		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();

	}

	@AfterClass
	void teardown() {

		driver.close();

	}

}
