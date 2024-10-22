package TestNG_EX;

import org.testng.annotations.Test;

public class FirstTestNGProgram {

	
	@Test(priority=7)
	void m() {
		
		System.out.println("Test");
		
	}
	@Test(priority=7)
	void m2() {
		
		System.out.println("Test1");
		
		
	}
	
	@Test(priority=8)
	void m1() {
		
		
		System.out.println("Test2");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
