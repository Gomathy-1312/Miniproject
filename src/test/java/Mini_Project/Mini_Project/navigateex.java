package Mini_Project.Mini_Project;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateex {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {


		WebDriver driver = new ChromeDriver();// ctrl+shift+o
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	//	driver.get("https://opensource-demo.orangehrmlive.com/");
		
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		
		// Nagivate to passing using URL object
		
//		Thread.sleep(10);
//	URL myurl = new URL("https://opensource-demo.orangehrmlive.com/");
//	driver.navigate().to(myurl);
		
	    driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']//*[name()='svg']")).click();
	    
	    
	    Set<String> windowIDs=driver.getWindowHandles();
		System.out.println(windowIDs);
		
		
		// Approach 1
     	List<String> windID = new ArrayList(windowIDs);
		
	      String parent=windID.get(0);
	      String child = windID.get(1);
	      
	      System.out.println(parent);
	      System.out.println(child);
	      
	     driver.switchTo().window(child).navigate().back();
	     driver.switchTo().window(parent).navigate().forward();
	     
	     
	     
	     
	      //Approach 2
	     
	     for (String x :windowIDs) {// for each
	    	 
	    	String title =driver.switchTo().window(x).getTitle();
	    	System.out.println(title);
    	
    	if(title.equals("OrangeHRM|LinkedIn")) {
	    		
	    		System.out.println(driver.getCurrentUrl());
	    		driver.close();
	    	}else {
	    		
	    		
	    		
	    	}
	    	 
	     }
	     
//	     //Approach 3
//	     
//	     for(String y :windowIDs ) {
//	     
//	     String title1=driver.switchTo().window(y).getTitle();
//	     System.out.println(title1);
//	     if(title1.equals("OrangeHRM | LinkedIn")) {
//	    	 
//	    	 driver.close();	    	 
//	     }
//	     
//	     
	     }
	     
	     
	     
	     
	     
	     
	     
	     
	      
	      
	      
	      
	      
	      
	      
	      
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


