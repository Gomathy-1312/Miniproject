package TestNG_EX;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	 

	  String s= "Welcome";
	  String s1="Welcoe";
	  
	  
	  if(s.equals(s1)) {
		  
		  System.out.println("Passed");
		  Assert.assertTrue(true);
		  
		  
	  }else {
		  
		  System.out.println("failed");
		  Assert.assertTrue(false);
	  }
	  
	  
	//  Assert.assertEquals(s, s1);  // hard assert
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
