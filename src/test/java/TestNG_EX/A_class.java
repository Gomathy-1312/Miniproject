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

public class A_class {

	@BeforeSuite
	void m() {
		
		System.out.println("login");
		
	}
	
	
	@Test
	void m1() {
		
		
		System.out.println("Test method 1");
		
	}
	
	
	
	void m2() {
		
		System.out.println("Test method 2");
		
	}
	
	
	@AfterSuite
	void m3() {
		
		System.out.println("Logout");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
