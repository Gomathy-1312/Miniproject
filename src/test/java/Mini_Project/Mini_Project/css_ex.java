package Mini_Project.Mini_Project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_ex {

	public static void main(String[] args) throws InterruptedException {



		ChromeDriver driver = new ChromeDriver();
		
		
		//get(url) - opens the url on the browser 
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		// getTitle() - returns title of the page
		
		System.out.println(driver.getTitle());
	
		//getCurrentUrl() - retuns URL of the page
		
	      System.out.println(driver.getCurrentUrl());
	      
	      //getPageSource()- returns source code of the page
	      
	      System.out.println(driver.getPageSource());
	      
		//getWindowHandle() - returns ID of the single Browser window
	      
	      System.out.println(driver.getWindowHandle());
	      
	    //getWindowHandles() - retuns ID's of the multiple browser windows

//	     WebElement logo=driver.findElement(By.linkText("OrangeHRM, Inc"));
//	      
//	     logo.click();
//	     
//	     Set<String> windowsID =driver.getWindowHandles();
//	     System.out.println(windowsID);
	     
	     // get navigate method
	     
	     driver.navigate().to("https://testautomationpractice.blogspot.com/");
	     
	     // ID
	     
	     WebElement malecheckbox = driver.findElement(By.id("male"));
	     malecheckbox.click();
	     
	     // isSelected
	     
	    boolean male= malecheckbox.isSelected();
	    System.out.println(male);
	     
	     WebElement femalecheckbox = driver.findElement(By.id("female"));
//	     femalecheckbox.click();
	     
	     //isselected
	     boolean female=femalecheckbox.isSelected();
	     System.out.println(female);
	     
	     driver.close(); // Close the single browser 
	     
	     
	     
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      

	   
		
	
	}

}
