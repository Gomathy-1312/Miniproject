package TestNG_EX;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoft {

	
	@Test
	void m() {
		
		
//		System.out.println("Testing");
//		System.out.println("Testing");
//		
//		
//		Assert.assertEquals("Welcome", "Java");  // hard assert
//		
//		System.out.println("Testing");
//		System.out.println("Testing");
		
		
		
		System.out.println("Testing");
		System.out.println("Testing");
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(false, true);
		
		System.out.println("Testing");
		System.out.println("Testing");
		s.assertAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
