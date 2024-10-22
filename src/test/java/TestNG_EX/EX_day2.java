package TestNG_EX;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EX_day2 {

	
	
	/*TC1
	----
	1) Login -- @BeforeMethod
	2) Search --->  @Test
	3) Logout  ---@AfterMethod*/
	
	
	
	
	@AfterSuite
	void logout() {
		
		System.out.println("logout");
		
		
	}
	
	@Test(priority=1)
	void search() {
		
		System.out.println("Search");
		
	}
	@Test(priority=2)
	void Reg() {
		
		System.out.println("Reg");
		
	}
	
	@BeforeSuite
	void login() {
		
		System.out.println("login");
		
	}
	
	
}
